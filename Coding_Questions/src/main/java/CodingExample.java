package main.java;

public class CodingExample {
	
	//print reverse tables
	  public int reverseTable(int num) {
	        for (int i = 10; i >= 1; i--) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	        }
			return num;
	  }
	
	  //print all alphabets
	public char getAlphabet(char alphabet) {
	    for (char ch = 'a'; ch <= 'z'; ch++) {
	        System.out.print(ch + " ");
	    }
	    return alphabet;
	}
	
	//print the ASCII values
	public String asciiValue(String ascii) {
	    for (char ch = 'A'; ch <= 'Z'; ch++) {
	        System.out.println(ch + " : " + (int) ch);
	    }
	    return ascii;
	}
	
	//factorial value of any number
	public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
	}
	
	//count number postive, negative and zeros
	 public String countnumbers(int[] input) {
	        int pos = 0, neg = 0, zero = 0;

	        for (int num : input) {
	            if (num > 0) pos++;
	            else if (num < 0) neg++;
	            else zero++;
	        }

	        return pos + " " + neg + " " + zero;
	    }
	 
	 //find largest and small
	 
	 public String findminmax(int[] input) {
	        if (input.length == 0) return "No input";

	        int min = input[0], max = input[0];

	        for (int num : input) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        return max + " " + min;
	    }
	
	//divisible by 9
	public String divisibleby() {
        int sum = 0;
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum = sum + i;
                count++;
            }
        }

        return "Count: " + count + ", Sum: " + sum;
    }
	
	//find 1s complement
	public int onescomplement(int num) {
		return ~num;
	}
	//find 2s complement
	public int twosComplement(int num) {
        return ~num + 1;
    }
	
	//fibonacci series
	public int fibonacciSeries(int number) {
	    int a = 0, b = 1;
	    for (int i = 0; i < number; i++) {
	        System.out.print(a + " ");
	        int next = a + b;
	        a = b;
	        b = next;
	    }
	    return number;
	}
	
	// highest frequency character in a String.
	public char highestFrequency(String input) {
	    int[] freq = new int[256];
	    for (char ch : input.toCharArray()) {
	        freq[ch]++;
	    }

	    int max = 0;
	    char result = ' ';
	    for (char ch : input.toCharArray()) {
	        if (freq[ch] > max) {
	            max = freq[ch];
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
