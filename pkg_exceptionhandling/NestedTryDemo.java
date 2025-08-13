package pkg_exceptionhandling;

public class NestedTryDemo {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3};
	        int a = 5;
	        int b = 0;

	        try {
	            System.out.println("Outer try block");

	            try {
	                System.out.println("Inner try block");
	                int result = a / b; // will cause ArithmeticException
	                System.out.println("Division Result: " + result);
	            } catch (ArithmeticException e) {
	                System.out.println("Inner catch: Cannot divide by zero");
	            }

	            int value = numbers[5]; //will cause ArrayIndexOutOfBoundsException
	            System.out.println("Value: " + value);

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Outer catch: Invalid array index");
	        } finally {
	        	System.out.println("This block will always execute");
	        }
	 }
}

