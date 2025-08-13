package student_course_reg;

class CourseAlreadyRegisteredException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseAlreadyRegisteredException(String message) {
        super(message);
    }
}

