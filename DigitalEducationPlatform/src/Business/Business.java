/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Course.CourseDirectory;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    FacultyDirectory facultydirectory;
    StudentDirectory studentdirectory;
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    CourseDirectory courseDirectory;

    public Business(String n) {
        name = n;

        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory();
        studentdirectory = new StudentDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        courseDirectory = new CourseDirectory();
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

}
