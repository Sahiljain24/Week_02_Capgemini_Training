/*question 3 
  Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.

 */
import java.util.Scanner;

// Class to check if a string is a palindrome
public class PalindromeChecker {
    
    private String text; // Attribute to store the string to be checked

    // Constructor to initialize the string
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the given string is a palindrome
    public boolean isPalindrome(String text) {
        int left = 0;                  // Pointer at the start of the string
        int right = text.length() - 1; // Pointer at the end of the string

        // Check characters from both ends
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;          // Return false if characters don't match
            }
            left++;                    // Move left pointer forward
            right--;                   // Move right pointer backward
        }
        return true;                   // Return true if all characters match
    }

    // Method to display if the string is a palindrome
    public void displayIsPalindrome() {
        boolean result = isPalindrome(text); // Check if the string is a palindrome
        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}

// Main class to test the PalindromeChecker class
class MainPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter the string:"); // Prompt user for input
        String text = sc.next();                // Read the input string

        // Create a PalindromeChecker object
        PalindromeChecker palindromeChecker = new PalindromeChecker(text);

        // Display if the string is a palindrome
        palindromeChecker.displayIsPalindrome();
    }
}
