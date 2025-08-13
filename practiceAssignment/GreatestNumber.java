// 6. Write a java program find out the greatest among 10 numbers.  

package practiceAssignment;

public class GreatestNumber {

    public void findGreatest() {
        int[] numbers = {2, 16, 42, 38, 56, 19, 5, 40};
        int greater = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > greater) {
                greater = numbers[i];
            }
        }
        System.out.println("Greatest number is: " + greater);
    }
}

