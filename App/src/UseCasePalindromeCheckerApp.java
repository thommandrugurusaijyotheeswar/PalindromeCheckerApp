/**
 * ==========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion. The function compares characters
 * from the start and end positions and calls itself
 * until the base condition is reached.
 *
 * @author Developer
 * @version 9.0
 */

public class UseCasePalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Call recursive function
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}