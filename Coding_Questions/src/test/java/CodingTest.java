package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.java.CodingExample;

public class CodingTest {

	CodingExample code = new CodingExample();

	@DisplayName("Reverse the table")
	@Test
	public void testreversetable() {
		int output = code.reverseTable(2);
		System.out.println(output);
		assertEquals(2,output);
	}

	@DisplayName("Alphabet a-z")
	@Test
	public void testGetAlphabet() {
		char input = ' ';
		char output = code.getAlphabet(input);
		System.out.println(output);
		assertEquals(input, output);
	}

	@DisplayName("ASCII value")
	@Test
	public void testasciivalue() {
		String input = " ";
		String output = code.asciiValue(input);
		assertEquals(input, output);

	}

	@DisplayName("Factorial")
	@Test
	public void testFactorial() {

		int output=code.factorial(3);
		System.out.println("Factorial of 5 is:" + output);
		assertEquals(6, output);

	}

	@DisplayName("Count of Positive,Negative and Zeroes")
	@Test
	public void testCountNumbers() {
		int[] input = {4, -1, 0, -2, 1, 0, 6}; 
		String expected = "3 2 2";
		String actual = code.countnumbers(input);
		assertEquals(expected, actual);
	}

	@DisplayName("largest and smallest ")
	@Test
	public void testmaxmin() {
		int[] input = {0, 1, 2, 3, 4, 5};
		String expected = "5 0";
		String actual = code.findminmax(input);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	@DisplayName("Divisible by 9 ")
	@Test
	public void testDivisibleBy() {
		String output = code.divisibleby();
		System.out.println(output);
		assertEquals("Count: 11, Sum: 1683", output);
	}

	@DisplayName("1's Complement")
	@Test
	public void testOnesComplement() {
		int output = code.onescomplement(3);
		System.out.println(output);
		assertEquals(-4, output);
	}

	@DisplayName("2's Complement ")
	@Test
	public void testTwosComplement() {
		int output = code.twosComplement(2);
		System.out.println(output);
		assertEquals(-2, output);

	}
	
	@DisplayName("Fibonacci Series")
	@Test
	public void testFibonacciSeries() {
		int output = code.fibonacciSeries(5);
		assertEquals(5, output);
		System.out.println();
	}
	
	@DisplayName("Highest Frequency Character")
	@Test
	public void testHighestFrequencyChar() {
	    char output = code.highestFrequency("Java");
	    System.out.println(output);
	    assertEquals('a', output);
	}
	
	@DisplayName("Replace First Vowel")
	@Test
	public void testReplaceFirstVowel() {
	    String output = code.replaceFirstVowel("Selenium");
	    System.out.println(output);
	    assertEquals("S-lenium", output);
	}
	
	@DisplayName("Count Alphabets, Digits, Special Characters")
	@Test
	public void testCountCharType() {
	    String output = code.countCharacters("S@K$#1");
	    System.out.println(output);
	    assertEquals("2 1 3", output);
	}

	@DisplayName("Remove Blank Spaces")
	@Test
	public void testRemoveSpace() {
	    String output = code.removeSpace("Hey, There!");
	    System.out.println(output);
	    assertEquals("Hey,There!", output);
	}

	@DisplayName("Concatenate Strings")
	@Test
	public void testConcatenateString() {
	    String output = code.concatenateString("Hello", "World");
	    System.out.println(output);
	    assertEquals("HelloWorld", output);
	}

}
