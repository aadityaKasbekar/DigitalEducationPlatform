/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Course.Course;
import Business.Person.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    Person person;
    List<Course> registeredCourseList;
    Map<Course, Integer> gpaMap;
    boolean isGraduated;

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setIsGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
    }

    public StudentProfile(Person p) {
        super(p);
        this.registeredCourseList = new ArrayList<Course>();
        this.gpaMap = new HashMap<>();
    }
    
    public void enrollToCourse(Course course) {
        this.registeredCourseList.add(course);
    }
    
    public List<Course> getRegisteredCourseList() {
        return this.registeredCourseList;
    }
    
    public void assignGradeByCourse(Course course, Integer gpa) {
        gpaMap.put(course, gpa);
    }
    
    public Map<Course, Integer> getGpaMap() {
        return this.gpaMap;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
