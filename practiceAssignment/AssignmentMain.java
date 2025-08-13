package practiceAssignment;

public class AssignmentMain {
	public static void main(String[] args){
		PalindromeText palindrome= new PalindromeText();
        palindrome.checkPalindrome("eye");
        
        FactorialNumber factorial = new FactorialNumber();
        factorial.calculateFactorial();  
        
        PrimeNumber prime = new PrimeNumber();
        prime.checkPrime(7);
        
        ReverseArray reverse = new ReverseArray();
        reverse.originalArray();
        reverse.reversedArray();
        
        MatrixExample matrix = new MatrixExample(); 
        matrix.addMatrix();
        
        GreatestNumber number = new GreatestNumber();
        number.findGreatest();
        
        SwapNumbers swap = new SwapNumbers(10, 20);
        swap.swap(); 
	}
}
