package main.java;

import java.util.HashMap;

public class StringCoding {

	// highest frequency character in a String.
	  public char highestFrequency(String input) {
	        HashMap<Character, Integer> map = new HashMap<>();
	        int max = 0;
	        char result = ' ';

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	            if (map.get(ch) > max) {
	                max = map.get(ch);
	                result = ch;
	            }
	        }
	        return result;
	    }

	// Replace vowel with - 
	public String replaceFirstVowel(String input) {
		return input.replaceFirst("[AEIOUaeiou]", "-");
	}

	// count alphabets, digits and special characters
	public String countCharacters(String input) {
		int alphabets = 0, digits = 0, specials = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				alphabets++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specials++;
			}
		}

		return alphabets + " " + digits + " " + specials;
	}

	// remove spaces
	public String removeSpace(String input) {
		return input.replaceAll(" ", "");
	}

	//Concatenate two strings
	public String concatenateString(String str1, String str2) {
		return str1 + str2;
	}
}
