package pkg_exceptionhandling;

public class ThrowAndThrows {
//	IllegalArgumentException
	public static void checkAge(int age)throws IllegalArgumentException{ // throws is used to warn that checkAge() might throw an exception.
		if (age < 18) {
			throw new IllegalArgumentException("You are not eligible to vote."); //throw is throwing the exception when age is less than 18.
		}else {
			System.out.println("You are eligible to vote.");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(17);   // Exception occurs here
		}catch(IllegalArgumentException ie ) {
			System.out.println("Exception Caught :" + ie.getMessage());
		}
		
		System.out.println("Program will continue");
		
	}
	
}
