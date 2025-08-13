// 3. Write a java program to find out the number entered is prime or not.

package practiceAssignment;

public class PrimeNumber {
    
    public void checkPrime(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) 
                count++;
        }

        if (count == 2) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not a Prime");
        }
    }
}