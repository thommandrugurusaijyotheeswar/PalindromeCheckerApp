import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ==========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome using both
 * Queue (FIFO) and Stack (LIFO) data structures.
 *
 * The application:
 * - Enqueues characters into a queue
 * - Pushes characters into a stack
 * - Compares dequeue and pop operations
 * - Displays the result
 *
 * @author Developer
 * @version 6.0
 */

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}