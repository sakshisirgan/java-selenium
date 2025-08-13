package student_course_reg;

import java.util.ArrayList;
import java.util.List;

class Student extends Person implements Registrable {
    private List<Course> regCourses = new ArrayList<>();

    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        if (regCourses.contains(course)) {
            throw new CourseAlreadyRegisteredException("Already registered: " + course);
        }
        regCourses.add(course);
        System.out.println(getName() + " registered for " + course);
    }

    @Override
    public void dropCourse(Course course) throws CourseNotFoundException {
        if (!regCourses.contains(course)) {
            throw new CourseNotFoundException("Not registered: " + course);
        }
        regCourses.remove(course);
        System.out.println(getName() + " dropped " + course);
    }

    @Override
    public void display(){
        System.out.println("\nStudent: " + getName() + " (ID: " + getId() + ")");
        System.out.println("Courses:");
        if (regCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
        	regCourses.forEach(c -> System.out.println("- " + c));
        }
    }
}
