/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class Instructor {
    private String instructorId;
    private String firstName;
    private String lastName;
    private String email;
    private Department department;
    
    public Instructor() {
    this.instructorId = UUID.randomUUID().toString();
}

public Instructor(String firstName, String lastName, String email, Department department) {
    this.instructorId = UUID.randomUUID().toString();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.department = department;
}

public String getInstructorId() { return instructorId; }
public void setInstructorId(String instructorId) { this.instructorId = instructorId; }

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public Department getDepartment() { return department; }
public void setDepartment(Department department) { this.department = department; }

@Override
public String toString() {
    return "Instructor{id='" + instructorId + "', name='" + firstName + " " + lastName + "'}";
}
}