// 7. Write a java program to swap the values a=10,b=20 without using a 3rd variable.
package practiceAssignment;

public class SwapNumbers {

    int a, b;

    public SwapNumbers(int x, int y) {
        a = x;
        b = y;
    }

    public void swap() {
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}

