import java.util.Date;
public class Student {
    private String id; // PK
    private String studentNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender; // Enum
    private String email;
    private String phone;
    private String address;
    private String programId; // FK -> Program
    private int enrollmentYear;
    private int classYear;
    private String status;
    private String photoUrl;
    private Date createdAt;
    
    public Student() {}
    
    public Student(String id, String studentNo, String nationalId, String firstName, String lastName, Date birthDate, Gender gender, String email, String phone, String address, String programId, int enrollmentYear, int classYear, String status, String photoUrl, Date createdAt) {
    this.id = id;
    this.studentNo = studentNo;
    this.nationalId = nationalId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.gender = gender;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.programId = programId;
    this.enrollmentYear = enrollmentYear;
    this.classYear = classYear;
    this.status = status;
    this.photoUrl = photoUrl;
    this.createdAt = createdAt;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getStudentNo() { return studentNo; }
public void setStudentNo(String studentNo) { this.studentNo = studentNo; }
public String getNationalId() { return nationalId; }
public void setNationalId(String nationalId) { this.nationalId = nationalId; }
public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }
public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }
public Date getBirthDate() { return birthDate; }
public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
public Gender getGender() { return gender; }
public void setGender(Gender gender) { this.gender = gender; }
public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }
public String getPhone() { return phone; }
public void setPhone(String phone) { this.phone = phone; }
public String getAddress() { return address; }
public void setAddress(String address) { this.address = address; }
public String getProgramId() { return programId; }
public void setProgramId(String programId) { this.programId = programId; }
public int getEnrollmentYear() { return enrollmentYear; }
public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }
public int getClassYear() { return classYear; }
public void setClassYear(int classYear) { this.classYear = classYear; }
public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }
public String getPhotoUrl() { return photoUrl; }
public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }
public Date getCreatedAt() { return createdAt; }
public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

@Override
public String toString() {
   return "Student Details:\n" +
           " ID: " + id + "\n" +
           " Student Number: " + studentNo + "\n" +
           " National ID: " + nationalId + "\n" +
           " First Name: " + firstName + "\n" +
           " Last Name: " + lastName + "\n" +
           " Birth Date: " + birthDate + "\n" +
           " Gender: " + gender + "\n" +
           " Email: " + email + "\n" +
           " Phone Number: " + phone + "\n" +
           " Address: " + address + "\n" +
           " Program ID: " + programId + "\n" +
           " Enrollment Year: " + enrollmentYear + "\n" +
           " Class Year: " + classYear + "\n" +
           " Photo URL: " + photoUrl + "\n" +
           " Created At: " + createdAt;
} 
}