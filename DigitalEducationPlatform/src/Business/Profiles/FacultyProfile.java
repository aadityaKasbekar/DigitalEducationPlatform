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
public class FacultyProfile extends Profile {

    Person person;
    private String specialization;
    private int rating;
    private List<StudentProfile> studentList;
//    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public int getRating() {
        return rating;
    }
    public void setRating() {
        this.rating = (int) (Math.random() * 5) + 1;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public FacultyProfile(Person p) {
        super(p);
        this.studentList = new ArrayList<StudentProfile>();
    }
    
    public List<StudentProfile> getStudentList() {
        return this.studentList;
    }
    
    public void addStudentToClass(StudentProfile sp) {
        this.studentList.add(sp);
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
