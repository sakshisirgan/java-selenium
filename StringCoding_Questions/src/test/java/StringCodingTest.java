package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.java.StringCoding;

public class StringCodingTest {
	
	StringCoding code = new StringCoding();
	
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
