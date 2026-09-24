/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

import java.util.UUID;
public class Faculty { private String facultyId; private String facultyName;
public Faculty() {
    this.facultyId = UUID.randomUUID().toString();
}

public Faculty(String facultyName) {
    this.facultyId = UUID.randomUUID().toString();
    this.facultyName = facultyName;
}

public String getFacultyId() { return facultyId; }
public void setFacultyId(String facultyId) { this.facultyId = facultyId; }

public String getFacultyName() { return facultyName; }
public void setFacultyName(String facultyName) { this.facultyName = facultyName; }

@Override
public String toString() {
    return "Faculty{id='" + facultyId + "', name='" + facultyName + "'}";
}
}
