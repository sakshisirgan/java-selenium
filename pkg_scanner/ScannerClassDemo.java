package pkg_scanner;

import java.util.Scanner;

public class ScannerClassDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        
        System.out.print("Enter your exam CGPA out of 10: ");
        double score = sc.nextDouble();
        
        System.out.print("Have you completed your final semester? (true/false): ");
        boolean isFinalSemesterCompleted = sc.nextBoolean();

        System.out.println("Name is: " + name + ", Age is: " + age + "Score is: " + score + ",Final Sem Completed:" + isFinalSemesterCompleted);
        sc.close();

    }
}
