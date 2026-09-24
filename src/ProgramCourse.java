/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class ProgramCourse {
    private String id;
    private Program program;
    private Course course;
    
    public ProgramCourse() {
    this.id = UUID.randomUUID().toString();
}

public ProgramCourse(Program program, Course course) {
    this.id = UUID.randomUUID().toString();
    this.program = program;
    this.course = course;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }

public Program getProgram() { return program; }
public void setProgram(Program program) { this.program = program; }

public Course getCourse() { return course; }
public void setCourse(Course course) { this.course = course; }

@Override
public String toString() {
    return "ProgramCourse{program=" + program.getProgramName() + ", course=" + course.getCourseCode() + "}";
}
}