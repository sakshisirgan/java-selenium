//1.   Calculate the Area of a circle
//2.  Calculate the area of a triangle
//3.  Calculate the area of a square
//4.  Calculate the Area of a rectangle
//5.  Calculate the Simple Interest (p,r,t)
//6.  Calculate the Amount without parameters
//        Amount = SI + P(1+r/100)^t

package main.java;

public class Box {
	public double circleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public double triangleArea(double base, double height) {
		return 0.5 * base * height;
	}
	
	public double squareArea(double side) {
		return side * side;
	}
	
	public double rectangleArea(double length, double breadth) {
		return length * breadth;
	}
	
	public double simpleInterest(double principal, double rate, double time) {
		return (principal*rate*time)/100;
	}
	
	public double calculateAmount() {
		double principal = 1000; 
        double rate = 10;        
        double time = 5;         

        double SI = simpleInterest(principal, rate, time);
        double amount = SI + (principal * Math.pow((1 + rate / 100), time));
        return amount;
	}

}

