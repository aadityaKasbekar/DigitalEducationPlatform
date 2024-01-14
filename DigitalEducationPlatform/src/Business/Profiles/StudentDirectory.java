/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {


    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

     studentlist = new ArrayList();

    }
    
    public List<StudentProfile> getStudentList() {
        return this.studentlist;
    }

    public StudentProfile newStudentProfile(StudentProfile sp) {

        
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.getPerson().getId().equals(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
