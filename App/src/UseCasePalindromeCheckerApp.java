import java.util.Deque;
import java.util.LinkedList;

/**
 * ==========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) data structure. The deque allows
 * insertion and deletion from both front and rear.
 *
 * The application:
 * - Inserts characters into a deque
 * - Removes first and last characters
 * - Compares them until the deque becomes empty
 * - Displays the result
 *
 * @author Developer
 * @version 7.0
 */

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert each character into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters from front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}