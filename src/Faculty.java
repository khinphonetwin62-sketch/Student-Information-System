/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

import java.util.Date;
public class Faculty {
    private String id; // PK
    private String code;
    private String name;
    private String deanId; // FK -> Instructor
    private String phone;
    private String email;
    private boolean isActive;
    private Date createdAt;
    
    public Faculty() {}
    
    public Faculty(String id, String code, String name, String deanId, String phone, String email, boolean isActive, Date createdAt) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.deanId = deanId;
    this.phone = phone;
    this.email = email;
    this.isActive = isActive;
    this.createdAt = createdAt;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getCode() { return code; }
public void setCode(String code) { this.code = code; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getDeanId() { return deanId; }
public void setDeanId(String deanId) { this.deanId = deanId; }
public String getPhone() { return phone; }
public void setPhone(String phone) { this.phone = phone; }
public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }
public boolean isIsActive() { return isActive; }
public void setIsActive(boolean isActive) { this.isActive = isActive; }
public Date getCreatedAt() { return createdAt; }
public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

@Override
public String toString() {
    return "Faculty{id='" + id + "', code='" + code + "', name='" + name + "'}";
}}
