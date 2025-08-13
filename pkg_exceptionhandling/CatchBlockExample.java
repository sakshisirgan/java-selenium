package pkg_exceptionhandling;

public class CatchBlockExample {
	 public static void main(String[] args) {
	        try {
	            int x = 12 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException ae) {
	            System.out.println("ArithmeticException Caught here: " + ae);

	            try {
	                String str = null;
	                int str_length = str.length(); // This will throw NullPointerException
	            } catch (NullPointerException ne) {
	                System.out.println("NullPointerException Occurred");
	            }
	        } finally {
	            System.out.println("Finally block executed....");
	        }
	 }
}

