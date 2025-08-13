package student_course_reg;

import java.util.ArrayList;
import java.util.List;

class RegistrationManager {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student s) { 
    	students.add(s); 
    }
    public void addCourse(Course c) {
    	courses.add(c);
    }
}
