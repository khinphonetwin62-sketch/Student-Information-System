/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class Course {
    private String courseId;
    private String courseCode;
    private String courseTitle;
    private int credits;
    
    public Course() {
    this.courseId = UUID.randomUUID().toString();
}

public Course(String courseCode, String courseTitle, int credits) {
    this.courseId = UUID.randomUUID().toString();
    this.courseCode = courseCode;
    this.courseTitle = courseTitle;
    this.credits = credits;
}

public String getCourseId() { return courseId; }
public void setCourseId(String courseId) { this.courseId = courseId; }

public String getCourseCode() { return courseCode; }
public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

public String getCourseTitle() { return courseTitle; }
public void setCourseTitle(String courseTitle) { this.courseTitle = courseTitle; }

public int getCredits() { return credits; }
public void setCredits(int credits) { this.credits = credits; }

@Override
public String toString() {
    return "Course{code='" + courseCode + "', title='" + courseTitle + "', credits=" + credits + "}";
}
}