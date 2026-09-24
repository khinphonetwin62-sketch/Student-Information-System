/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class Program {
    private String programId;
    private String programName;
    private Department department;
    
    public Program() {
    this.programId = UUID.randomUUID().toString();
}

public Program(String programName, Department department) {
    this.programId = UUID.randomUUID().toString();
    this.programName = programName;
    this.department = department;
}

public String getProgramId() { return programId; }
public void setProgramId(String programId) { this.programId = programId; }

public String getProgramName() { return programName; }
public void setProgramName(String programName) { this.programName = programName; }

public Department getDepartment() { return department; }
public void setDepartment(Department department) { this.department = department; }

@Override
public String toString() {
    return "Program{id='" + programId + "', name='" + programName + "', department=" + department + "}";
}
}