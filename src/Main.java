/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // 1. Setup Entities
        Faculty engineeringFaculty = new Faculty("Faculty of Engineering and Natural Sciences");
        Department seDept = new Department("Software Engineering", engineeringFaculty);
        Program seProgram = new Program("B.Sc. in Software Engineering", seDept);
        
        // 2. Create Student List (using ArrayList)
        ArrayList<Student> studentList = new ArrayList<>();
        
        // 3. Simulate Student Registration
        Student student1 = new Student(
            "Khin Phone",
            "Twin",
            "khinphonetwin@example.com",
            Gender.FEMALE,
            seProgram
    );

        studentList.add(student1);

        // 4. Print registered student(s) to console
        System.out.println("=== Registered Students ===");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}