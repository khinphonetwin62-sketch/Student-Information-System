import java.util.Date;
public class Instructor {
    private String id; // PK
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String departmentId; // FK -> Department
    private String title;
    private String specialization;
    private Date hireDate;
    private boolean isActive;
    
    public Instructor() {}

    public Instructor(String id, String employeeNo, String nationalId, String firstName, String lastName, String email, String phone, String departmentId, String title, String specialization, Date hireDate, boolean isActive) {
    this.id = id;
    this.employeeNo = employeeNo;
    this.nationalId = nationalId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.departmentId = departmentId;
    this.title = title;
    this.specialization = specialization;
    this.hireDate = hireDate;
    this.isActive = isActive;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getEmployeeNo() { return employeeNo; }
public void setEmployeeNo(String employeeNo) { this.employeeNo = employeeNo; }
public String getNationalId() { return nationalId; }
public void setNationalId(String nationalId) { this.nationalId = nationalId; }
public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }
public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }
public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }
public String getPhone() { return phone; }
public void setPhone(String phone) { this.phone = phone; }
public String getDepartmentId() { return departmentId; }
public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getSpecialization() { return specialization; }
public void setSpecialization(String specialization) { this.specialization = specialization; }
public Date getHireDate() { return hireDate; }
public void setHireDate(Date hireDate) { this.hireDate = hireDate; }
public boolean isIsActive() { return isActive; }
public void setIsActive(boolean isActive) { this.isActive = isActive; }

@Override
public String toString() {
    return "Instructor{id='" + id + "', employeeNo='" + employeeNo + "', name='" + firstName + " " + lastName + "'}";
}}