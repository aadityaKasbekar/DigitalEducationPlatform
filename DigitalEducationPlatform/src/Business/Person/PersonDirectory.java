/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {

    ArrayList<Profile> personlist;
   

    public PersonDirectory() {
        personlist = new ArrayList();
       
    }

    public ArrayList<Profile> getPersonlist() {
        return personlist;
    }

    public StudentProfile newStudent(Person p, String role) {
        StudentProfile profile = new StudentProfile(p);

        personlist.add(profile);
        
        return profile;

    }

    public FacultyProfile newFaculty(Person p, String role, String specialization) {
        FacultyProfile profile = new FacultyProfile(p);
        profile.setSpecialization(specialization);
        personlist.add(profile);
        
        return profile;
    }

    public Profile findPerson(String id) {

        for (Profile p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

}
