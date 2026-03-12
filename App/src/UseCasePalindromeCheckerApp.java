/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This program demonstrates Object-Oriented design by
 * encapsulating palindrome checking logic inside a
 * separate class called PalindromeChecker.
 *
 * The application creates an object of the service
 * class and calls the checkPalindrome() method.
 *
 * @author Developer
 * @version 11.0
 */

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call palindrome method
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}