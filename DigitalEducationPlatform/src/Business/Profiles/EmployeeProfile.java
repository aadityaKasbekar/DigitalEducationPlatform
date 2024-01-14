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
public class EmployeeProfile extends Profile {

    private List<StudentProfile> graduationStudentRequests;


    public EmployeeProfile(Person p) {
        super(p); 
        this.graduationStudentRequests = new ArrayList<>();
    }
    
    public void addStudentGraduationRequest(StudentProfile sp) {
        this.graduationStudentRequests.add(sp);
    }
    
    
    
    @Override
    public String getRole(){
        return  "Admin";
    }

}