/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Program program;
    
    public Student() {
    this.studentId = UUID.randomUUID().toString();
}

public Student(String firstName, String lastName, String email, Gender gender, Program program) {
    this.studentId = UUID.randomUUID().toString();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.program = program;
}

public String getStudentId() { return studentId; }
public void setStudentId(String studentId) { this.studentId = studentId; }

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }

public Gender getGender() { return gender; }
public void setGender(Gender gender) { this.gender = gender; }

public Program getProgram() { return program; }
public void setProgram(Program program) { this.program = program; }

@Override
public String toString() {
    return "Student{" +
            "id='" + studentId + '\'' +
            ", name='" + firstName + " " + lastName + '\'' +
            ", email='" + email + '\'' +
            ", gender=" + gender +
            ", program=" + (program != null ? program.getProgramName() : "N/A") +
            '}';
}
}