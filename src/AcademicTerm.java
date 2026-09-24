/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khinbhonethwin
 */
import java.util.UUID;

public class AcademicTerm {
    private String termId;
    private String termName;
    private int year;
    
    public AcademicTerm() {
    this.termId = UUID.randomUUID().toString();
}

public AcademicTerm(String termName, int year) {
    this.termId = UUID.randomUUID().toString();
    this.termName = termName;
    this.year = year;
}

public String getTermId() { return termId; }
public void setTermId(String termId) { this.termId = termId; }

public String getTermName() { return termName; }
public void setTermName(String termName) { this.termName = termName; }

public int getYear() { return year; }
public void setYear(int year) { this.year = year; }

@Override
public String toString() {
    return "AcademicTerm{name='" + termName + "', year=" + year + "}";
}
}