// 2. Write a java program to find out the factorial of a number.

package practiceAssignment;

public class FactorialNumber {

    int number;
    public FactorialNumber() {
        number = 5; 
    }
    public void calculateFactorial() {
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial of " + number + " is: " + fact);
    }
}


