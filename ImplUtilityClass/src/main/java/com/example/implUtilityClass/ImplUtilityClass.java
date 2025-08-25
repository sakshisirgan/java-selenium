package com.example.implUtilityClass;

import com.example.implementutilityclass.UtilityClass; // Import from UtilityClass jar

public class ImplUtilityClass {
    public static void main(String[] args) {
        int resultAdd = UtilityClass.add(3433, 33);
        int resultSub = UtilityClass.sub(100, 33);
        int resultMul = UtilityClass.mul(5, 6);
        int resultDiv = UtilityClass.div(100, 5);

        System.out.println("Addition is: " + resultAdd);
        System.out.println("Subtraction is: " + resultSub);
        System.out.println("Multiplication is: " + resultMul);
        System.out.println("Division is: " + resultDiv);
    }
}
