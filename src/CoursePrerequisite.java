/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class CoursePrerequisite {
    private String id;
    private Course course;
    private Course prerequisiteCourse;
    
    public CoursePrerequisite() {
    this.id = UUID.randomUUID().toString();
}

public CoursePrerequisite(Course course, Course prerequisiteCourse) {
    this.id = UUID.randomUUID().toString();
    this.course = course;
    this.prerequisiteCourse = prerequisiteCourse;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public Course getCourse() { return course; }
public void setCourse(Course course) { this.course = course; }

public Course getPrerequisiteCourse() { return prerequisiteCourse; }
public void setPrerequisiteCourse(Course prerequisiteCourse) { this.prerequisiteCourse = prerequisiteCourse; }

@Override
public String toString() {
    return "CoursePrerequisite{course=" + course.getCourseCode() + ", prerequisite=" + prerequisiteCourse.getCourseCode() + "}";
}
}