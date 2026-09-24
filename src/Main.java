import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) { 
    // 1. Create a List of Students
    ArrayList<Student> studentList = new ArrayList<>();
    // 2. Simulate Student Registration based on ER Diagram Fields
    Student student1 = new Student();
    student1.setId(UUID.randomUUID().toString());
    student1.setStudentNo("250504531");
    student1.setNationalId("98566302942");
    student1.setFirstName("Khin Phone");
    student1.setLastName("Twin");
    student1.setBirthDate(new Date());
    student1.setGender(Gender.FEMALE);
    student1.setEmail("250504531@st.atlas.edu.tr");
    student1.setPhone("+905518160026");
    student1.setAddress("Istanbul, Turkey");
    student1.setProgramId(UUID.randomUUID().toString());
    student1.setEnrollmentYear(2024);
    student1.setClassYear(2);
    student1.setStatus("ACTIVE");
    student1.setPhotoUrl("http://example.com/photo.jpg");
    student1.setCreatedAt(new Date());

    // Add to list
    studentList.add(student1);

    // 3. Print the registered student(s) to console
    System.out.println("=== Registered Students ===");
    for (Student s : studentList) {
        System.out.println(s.toString());
    }
}}