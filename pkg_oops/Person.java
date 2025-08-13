package pkg_oops;
 
// Implementing one of the OOPS principles - Encapsulation
public class Person {
	// Private variables - data hiding
	private String name;
	private int age;
 
	// Public getter method for name
	public String getName() {
		return name;
	}
 
	// Public setter method for name
	public void setName(String newName) {
		name = newName;
	}
 
	// Public getter method for age
	public int getAge() {
		return age;
	}
 
	// Public setter method for age
	public void setAge(int newAge) {
		if (newAge > 0) {
			age = newAge;
		} else {
			System.out.println("Age must be positive.");
		}
	}
}
