package student_course_reg;

abstract class Person {
    private String studName;
    private int studId;

    public Person(String studName, int studId) {
        this.studName = studName;
        this.studId= studId;
    }

    public String getName() {
    	return studName; 
    }
    public int getId() { 
    	return studId;
    }

    public abstract void display();
}
