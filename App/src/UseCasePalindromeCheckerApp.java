import java.util.Scanner;

/**
 * ==========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Description:
 * This program checks whether a string is a palindrome
 * while ignoring spaces and letter case differences.
 * The input string is normalized before performing
 * the palindrome validation.
 *
 * @author Developer
 * @version 10.0
 */

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}