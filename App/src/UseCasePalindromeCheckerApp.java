import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This program demonstrates the Strategy Design Pattern
 * where different palindrome checking algorithms can be
 * selected dynamically at runtime.
 *
 * Strategies implemented:
 * 1. StackStrategy
 * 2. DequeStrategy
 *
 * The PalindromeService class uses a PalindromeStrategy
 * interface to execute the selected algorithm.
 *
 * @author Developer
 * @version 12.0
 */

/* Strategy Interface */
interface PalindromeStrategy {
    boolean check(String input);
}

/* Stack Strategy Implementation */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/* Deque Strategy Implementation */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}

/* Service Class Using Strategy */
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

/* Application Entry Point */
public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}