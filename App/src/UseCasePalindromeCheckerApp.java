import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

/**
 * ==========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This program compares the performance of different
 * palindrome checking algorithms by measuring execution
 * time using System.nanoTime().
 *
 * Algorithms compared:
 * 1. Simple String Comparison
 * 2. Stack Based Approach
 * 3. Deque Based Approach
 *
 * @author Developer
 * @version 13.0
 */

public class UseCasePalindromeCheckerApp {

    /* Method 1: Simple String Reverse */
    public static boolean simpleCheck(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return input.equals(reversed);
    }

    /* Method 2: Stack Based Check */
    public static boolean stackCheck(String input) {

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

    /* Method 3: Deque Based Check */
    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Simple Method Timing
        long start1 = System.nanoTime();
        boolean result1 = simpleCheck(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("Input : " + input);

        System.out.println("\nSimple String Method:");
        System.out.println("Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("\nStack Method:");
        System.out.println("Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");

        System.out.println("\nDeque Method:");
        System.out.println("Result : " + result3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns");
    }
}