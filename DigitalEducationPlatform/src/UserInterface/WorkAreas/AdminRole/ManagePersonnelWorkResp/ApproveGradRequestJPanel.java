/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp;

import Business.Business;
import Business.Course.Course;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kal bugrara
 */
public class ApproveGradRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersJPanel
     */
    JPanel CardSequencePanel;

    Business business;
    EmployeeProfile employee;

    public ApproveGradRequestJPanel(Business bz, EmployeeProfile ep, JPanel jp) {
        CardSequencePanel = jp;
        this.business = bz;
        this.employee = ep;
        initComponents();
        refreshTable();
    }

    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequests.getModel();
        dtm.setRowCount(0);
        StudentDirectory sd = business.getStudentdirectory();
        for (StudentProfile sp : sd.getStudentList()) {
            if (sp.getRegisteredCourseList().size() >= 8) {
                Object[] row = new Object[7];
                row[0] = sp.getPerson().getId();
                row[1] = sp.getPerson().getName();
                row[2] = sp.getRegisteredCourseList().size();
                row[3] = sp.isGraduated() ? "Yes" : "No";
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnApproveGrad = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(null);

        Back.setBackground(new java.awt.Color(0, 153, 255));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back);
        Back.setBounds(10, 30, 80, 23);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Graduation Requests");
        add(jLabel2);
        jLabel2.setBounds(380, 60, 550, 28);

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student name", "Student courses", "Is Graduated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequests);

        add(jScrollPane1);
        jScrollPane1.setBounds(180, 130, 630, 120);

        btnApproveGrad.setBackground(new java.awt.Color(0, 153, 255));
        btnApproveGrad.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveGrad.setText("Approve Graduation");
        btnApproveGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveGradActionPerformed(evt);
            }
        });
        add(btnApproveGrad);
        btnApproveGrad.setBounds(400, 400, 160, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        AdminRoleWorkAreaJPanel adminRoleWorkAreaPanel = new AdminRoleWorkAreaJPanel(business, employee, CardSequencePanel);
        CardSequencePanel.add("adminRoleWorkAreaPanel", adminRoleWorkAreaPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_BackActionPerformed

    private void btnApproveGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveGradActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();

        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Would you like 'Graduate' this student?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                String studentId = tblRequests.getModel().getValueAt(selectedRow, 0).toString();
                StudentDirectory studentDir = business.getStudentdirectory();
                StudentProfile spRef = studentDir.findStudent(studentId);
                spRef.setIsGraduated(true);
                refreshTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnApproveGradActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnApproveGrad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    // End of variables declaration//GEN-END:variables

}
