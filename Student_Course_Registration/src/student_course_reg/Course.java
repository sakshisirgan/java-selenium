package student_course_reg;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() { 
    	return courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }

    @Override
    public boolean equals(Object courseObj) {
        if (this == courseObj) {
        	return true;
        }
        if (!(courseObj instanceof Course)) {
        	return false;
        }
        Course c = (Course) courseObj;
        return courseName.equals(c.courseName);
    }

    @Override
    public int hashCode() {
        return courseName.hashCode();
    }
}
