/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

//import Business.ProfessorClasses.Professor;
import java.util.ArrayList;

/**
 *
 * @author sakshiwadaskar
 */
public class CourseDirectory {
    
    private ArrayList<Course> courseCatalog; 
    
    
    public CourseDirectory(){
      this.courseCatalog = new ArrayList<>();
    }

    public ArrayList<Course> getCourseCatalog() {
        return this.courseCatalog;
    }
    public void addCourse(Course course){
        this.courseCatalog.add(course);
    }
    public void deleteCourse(Course course){
        this.courseCatalog.remove(course);
    }
    
    public Course searchCourse(String courseID) {
        for (Course course : courseCatalog) {
            if (course.getCourseID().equals(courseID)) {
                return course;
            }
        }
        return null;
    }
}
