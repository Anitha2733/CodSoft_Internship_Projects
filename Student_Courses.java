// Student.java
import java.util.HashSet;
import java.util.Set;

public class Student_Courses {
    private String studentId;
    private String name;
    private Set<String> registeredCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new HashSet<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRegisteredCourses() {
        return registeredCourses;
    }

    public boolean registerCourse(String courseCode) {
        return registeredCourses.add(courseCode);
    }

    public boolean dropCourse(String courseCode) {
        return registeredCourses.remove(courseCode);
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s\nName: %s\nRegistered Courses: %s", studentId, name, registeredCourses);
    }
}
