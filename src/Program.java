/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */

public class Program {
    private String id; // PK
    private String code;
    private String name;
    private String departmentId; // FK -> Department
    private String degreeLevel;
    private int totalCredits;
    private int durationYears;
    private String language;
    private boolean isActive;
    
    public Program() {}
    
    public Program(String id, String code, String name, String departmentId, String degreeLevel, int totalCredits, int durationYears, String language, boolean isActive) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.departmentId = departmentId;
    this.degreeLevel = degreeLevel;
    this.totalCredits = totalCredits;
    this.durationYears = durationYears;
    this.language = language;
    this.isActive = isActive;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getCode() { return code; }
public void setCode(String code) { this.code = code; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getDepartmentId() { return departmentId; }
public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
public String getDegreeLevel() { return degreeLevel; }
public void setDegreeLevel(String degreeLevel) { this.degreeLevel = degreeLevel; }
public int getTotalCredits() { return totalCredits; }
public void setTotalCredits(int totalCredits) { this.totalCredits = totalCredits; }
public int getDurationYears() { return durationYears; }
public void setDurationYears(int durationYears) { this.durationYears = durationYears; }
public String getLanguage() { return language; }
public void setLanguage(String language) { this.language = language; }
public boolean isIsActive() { return isActive; }
public void setIsActive(boolean isActive) { this.isActive = isActive; }

@Override
public String toString() {
    return "Program{id='" + id + "', code='" + code + "', name='" + name + "'}";
}}