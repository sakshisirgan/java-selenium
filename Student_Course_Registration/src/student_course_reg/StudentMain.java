package student_course_reg;

public class StudentMain {
    public static void main(String[] args) {
        RegistrationManager manager = new RegistrationManager();

        Course java = new Course("Java");
        Course selenium = new Course("Selenium");
        Course react = new Course("React");
        Course angular = new Course("Angular");

        manager.addCourse(java);
        manager.addCourse(selenium);
        manager.addCourse(react);
        manager.addCourse(angular);

        Student s1 = new Student("Lara", 1);
        Student s2 = new Student("Marie", 2);

        manager.addStudent(s1);
        manager.addStudent(s2);

        try {
            s1.registerCourse(java);
            s1.registerCourse(selenium);
            s1.registerCourse(react);

            System.out.println();

            s2.registerCourse(java);
            s2.registerCourse(selenium);
            s2.registerCourse(selenium); // will throw exception
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        try {
            s1.dropCourse(angular); // will throw exception
        } catch (CourseNotFoundException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        s1.display();
        s2.display();
    }
}
