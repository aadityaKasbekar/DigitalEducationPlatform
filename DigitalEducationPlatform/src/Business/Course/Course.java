/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

//import Business.ProfessorClasses.Professor;

import Business.Profiles.FacultyProfile;


/**
 *
 * @author sakshiwadaskar
 */
public class Course {

    private String courseName;
    private String courseID;
    private String termOfferedIn;
    private String region;
    private String language;
    private String courseDescription;
    private String courseTopic;
    private String creditHours;
    private FacultyProfile facultyProfile;

    public FacultyProfile getFacultyProfile() {
        return facultyProfile;
    }

    public void setFacultyProfile(FacultyProfile facultyProfile) {
        this.facultyProfile = facultyProfile;
    }



    public String getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(String creditHours) {
        this.creditHours = creditHours;
    }
 
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseTopic() {
        return courseTopic;
    }
    public void setCourseTopic(String courseTopic) {
        this.courseTopic = courseTopic;
    }

    public String getTermOfferedIn() {
        return termOfferedIn;
    }
    public void setTermOfferedIn(String termOfferedIn) {
        this.termOfferedIn = termOfferedIn;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return courseName;
    }
}
