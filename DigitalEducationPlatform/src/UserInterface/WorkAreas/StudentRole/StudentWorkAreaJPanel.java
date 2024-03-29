/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.StudentRole;

import Business.Business;
import Business.Profiles.StudentProfile;
import UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01.CourseWorkJPanel;
import UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp02.CourseRegistrationJPanel;
import UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp03.StudentProfileJPanel;
import UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp04.GraduationAuditJPanel;
import UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp05.TranscriptJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    StudentProfile student;

    /**
     * Creates new form UnitRiskWorkArea
     *
     * @param b
     * @param spp
     * @param clp
     */
    public StudentWorkAreaJPanel(Business b, StudentProfile spp, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        student = spp;
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCourseWork = new javax.swing.JButton();
        btnStudentProfile = new javax.swing.JButton();
        btnGraduationAudit = new javax.swing.JButton();
        btnVCourseRegistration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTranscript = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        btnCourseWork.setBackground(new java.awt.Color(0, 153, 255));
        btnCourseWork.setFont(getFont());
        btnCourseWork.setForeground(new java.awt.Color(255, 255, 255));
        btnCourseWork.setText("Course Work");
        btnCourseWork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCourseWork.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCourseWork.setMinimumSize(new java.awt.Dimension(20, 23));
        btnCourseWork.setPreferredSize(new java.awt.Dimension(240, 30));
        btnCourseWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseWorkIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnStudentProfile.setBackground(new java.awt.Color(0, 153, 255));
        btnStudentProfile.setFont(getFont());
        btnStudentProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnStudentProfile.setText("Manage Profile");
        btnStudentProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudentProfile.setMaximumSize(new java.awt.Dimension(200, 40));
        btnStudentProfile.setMinimumSize(new java.awt.Dimension(20, 20));
        btnStudentProfile.setPreferredSize(new java.awt.Dimension(240, 25));
        btnStudentProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentProfileActionPerformed(evt);
            }
        });

        btnGraduationAudit.setBackground(new java.awt.Color(0, 153, 255));
        btnGraduationAudit.setFont(getFont());
        btnGraduationAudit.setForeground(new java.awt.Color(255, 255, 255));
        btnGraduationAudit.setText("Graduation Audit");
        btnGraduationAudit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGraduationAudit.setMaximumSize(new java.awt.Dimension(200, 40));
        btnGraduationAudit.setMinimumSize(new java.awt.Dimension(20, 20));
        btnGraduationAudit.setPreferredSize(new java.awt.Dimension(240, 25));
        btnGraduationAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraduationAuditActionPerformed(evt);
            }
        });

        btnVCourseRegistration.setBackground(new java.awt.Color(0, 153, 255));
        btnVCourseRegistration.setFont(getFont());
        btnVCourseRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnVCourseRegistration.setText("Registration");
        btnVCourseRegistration.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVCourseRegistration.setMaximumSize(new java.awt.Dimension(200, 40));
        btnVCourseRegistration.setMinimumSize(new java.awt.Dimension(20, 20));
        btnVCourseRegistration.setPreferredSize(new java.awt.Dimension(240, 25));
        btnVCourseRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVCourseRegistrationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Student Portal");

        btnTranscript.setBackground(new java.awt.Color(0, 153, 255));
        btnTranscript.setFont(getFont());
        btnTranscript.setForeground(new java.awt.Color(255, 255, 255));
        btnTranscript.setText("Transcript");
        btnTranscript.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTranscript.setMaximumSize(new java.awt.Dimension(200, 40));
        btnTranscript.setMinimumSize(new java.awt.Dimension(20, 20));
        btnTranscript.setPreferredSize(new java.awt.Dimension(240, 25));
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTranscript, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnCourseWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(btnStudentProfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVCourseRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGraduationAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVCourseRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGraduationAudit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseWorkIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseWorkIdentifyResourceAssetsActionPerformed

        CourseWorkJPanel courseWorkPanel = new CourseWorkJPanel(business, student, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseWork", courseWorkPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnCourseWorkIdentifyResourceAssetsActionPerformed

    private void btnStudentProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentProfileActionPerformed
        // TODO add your handling code here:
        StudentProfileJPanel studentrofilePanel = new StudentProfileJPanel(business, student, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("StudentProfile", studentrofilePanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

}//GEN-LAST:event_btnStudentProfileActionPerformed

    private void btnGraduationAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraduationAuditActionPerformed
        // TODO add your handling code here:
        GraduationAuditJPanel graduationAuditPanel = new GraduationAuditJPanel(business, student, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("GraduationAudit", graduationAuditPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
        

        /*       ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
         */
    }//GEN-LAST:event_btnGraduationAuditActionPerformed

    private void btnVCourseRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVCourseRegistrationActionPerformed
        // TODO add your handling code here:
        CourseRegistrationJPanel courseRegistrationPanel = new CourseRegistrationJPanel(business, student, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("CourseWork", courseRegistrationPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
}//GEN-LAST:event_btnVCourseRegistrationActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        // TODO add your handling code here:
        TranscriptJPanel transcriptPanel = new TranscriptJPanel(business, student, CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Transcripts", transcriptPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnTranscriptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseWork;
    private javax.swing.JButton btnGraduationAudit;
    private javax.swing.JButton btnStudentProfile;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JButton btnVCourseRegistration;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
