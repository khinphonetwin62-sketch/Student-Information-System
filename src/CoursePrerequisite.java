public class CoursePrerequisite {
    private String id; // PK
    private String courseId; // FK -> Course
    private String prerequisiteCourseId; // FK -> Course
    private String type;
    private String minGrade;
    public CoursePrerequisite() {}

    public CoursePrerequisite(String id, String courseId, String prerequisiteCourseId, String type, String minGrade) {
    this.id = id;
    this.courseId = courseId;
    this.prerequisiteCourseId = prerequisiteCourseId;
    this.type = type;
    this.minGrade = minGrade;
}

public String getId() { return id; }
public void setId(String id) { this.id = id; }
public String getCourseId() { return courseId; }
public void setCourseId(String courseId) { this.courseId = courseId; }
public String getPrerequisiteCourseId() { return prerequisiteCourseId; }
public void setPrerequisiteCourseId(String prerequisiteCourseId) { this.prerequisiteCourseId = prerequisiteCourseId; }
public String getType() { return type; }
public void setType(String type) { this.type = type; }
public String getMinGrade() { return minGrade; }
public void setMinGrade(String minGrade) { this.minGrade = minGrade; }

@Override
public String toString() {
    return "CoursePrerequisite{id='" + id + "', courseId='" + courseId + "', prerequisiteCourseId='" + prerequisiteCourseId + "'}";
}}