// 1. Write a java program to find out whether the text is palindrome or not.

package practiceAssignment;

public class PalindromeText {
    public void checkPalindrome(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse)) {
            System.out.println( text + " is a palindrome word");
        } else {
            System.out.println( text + "is not a palindrome word");
        }
    }
}

