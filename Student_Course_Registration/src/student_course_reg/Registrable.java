package student_course_reg;

interface Registrable {
    void registerCourse(Course course) throws CourseAlreadyRegisteredException;
    void dropCourse(Course course) throws CourseNotFoundException;
}
