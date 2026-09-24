/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

public class ProgramCourse {
    private String id; // PK
    private String programId; // FK -> Program
    private String courseId; // FK -> Course
    private int semesterOrder;
    private String courseType;
    private boolean isActive;
    
    public ProgramCourse() {}
    
    public ProgramCourse(String id, String programId, String courseId, int semesterOrder, String courseType, boolean isActive) {
    this.id = id;
    this.programId = programId;
    this.courseId = courseId;
    this.semesterOrder = semesterOrder;
    this.courseType = courseType;
    this.isActive = isActive;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getProgramId() { return programId; }
public void setProgramId(String programId) { this.programId = programId; }
public String getCourseId() { return courseId; }
public void setCourseId(String courseId) { this.courseId = courseId; }
public int getSemesterOrder() { return semesterOrder; }
public void setSemesterOrder(int semesterOrder) { this.semesterOrder = semesterOrder; }
public String getCourseType() { return courseType; }
public void setCourseType(String courseType) { this.courseType = courseType; }
public boolean isIsActive() { return isActive; }
public void setIsActive(boolean isActive) { this.isActive = isActive; }

@Override
public String toString() {
    return "ProgramCourse{id='" + id + "', programId='" + programId + "', courseId='" + courseId + "'}";
}}