package pkg_exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionClass {
    public static void main(String[] args) {
        int num, den, result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        num = sc.nextInt();

        System.out.print("Enter the denominator: ");
        den = sc.nextInt();

        try {
            int[] arr = new int[4];
            arr[8] = 98; 

            result = num / den;  
            System.out.println("Result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the numerator by zero.");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Index not valid.");
            ae.printStackTrace();
        } finally {
            result = num / 30;  
            System.out.println("Result in finally block: " + result);
            System.out.println("Finally block is always executed.");
        }

        sc.close();
    }
}
