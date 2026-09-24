/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

import java.util.UUID;
public class Department { private String departmentId; private String departmentName; private Faculty faculty;
public Department() {
    this.departmentId = UUID.randomUUID().toString();
}

public Department(String departmentName, Faculty faculty) {
    this.departmentId = UUID.randomUUID().toString();
    this.departmentName = departmentName;
    this.faculty = faculty;
}

public String getDepartmentId() { return departmentId; }
public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

public String getDepartmentName() { return departmentName; }
public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

public Faculty getFaculty() { return faculty; }
public void setFaculty(Faculty faculty) { this.faculty = faculty; }

@Override
public String toString() {
    return "Department{id='" + departmentId + "', name='" + departmentName + "', faculty=" + faculty + "}";
}
}