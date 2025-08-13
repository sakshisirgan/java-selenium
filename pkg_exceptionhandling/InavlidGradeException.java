package pkg_exceptionhandling;
import java.util.Scanner;

// Custom Exception Example
class InvalidGradeException extends Exception {
	
	// Default Constructor 
	public InvalidGradeException() {
		super("Invalid Grade Provided");
	}
	
	//Custom message using constructor
	public InvalidGradeException(String message) {
		super(message);
	}
}
class GradeValidator{
	public void validate(int grade) throws InvalidGradeException{
		if (grade < 0 || grade > 100) {
			throw new InvalidGradeException("The Grade must range from 0 to 100.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students:");
		int number = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Number of students are: " + number);

		GradeValidator validator = new GradeValidator();
		
		//try catch block
		try {
			System.out.print("Enter student’s name: ");
			String name = sc.nextLine();

			System.out.print("Enter student’s grade (integer between 0 and 100): ");
			int studentGrade = sc.nextInt();

			System.out.println("Name of student is: " + name);
			System.out.println("Student grade is: " + studentGrade);
			try {
				validator.validate(studentGrade);
			 }catch(InvalidGradeException ie) {
				System.out.println("Exception Caught: "+ ie.getMessage());
			 }
		}finally {
			sc.close();
			System.out.println("Program Ended.");
		}
	}
}