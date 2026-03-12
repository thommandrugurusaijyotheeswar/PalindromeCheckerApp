# UC13 – Performance Comparison of Palindrome Algorithms

## Objective

The objective of this program is to compare the **performance of different palindrome checking algorithms** by measuring their execution time.

This helps analyze which algorithm performs better under similar conditions.

---

# Key Concepts Used

## 1. System.nanoTime()

`System.nanoTime()` is used to measure **execution time in nanoseconds**.

Example:

```
long start = System.nanoTime();
long end = System.nanoTime();
```

Execution time:

```
end - start
```

---

# Algorithms Compared

## 1. Simple String Reverse Method

The string is reversed and compared with the original string.

Steps:

1. Reverse the string using a loop
2. Compare original and reversed strings

---

## 2. Stack Based Method

Uses a **Stack (LIFO)** to reverse the order of characters.

Steps:

1. Push characters into stack
2. Pop characters
3. Compare with original string

---

## 3. Deque Based Method

Uses **Deque (Double Ended Queue)** to compare front and rear characters.

Steps:

1. Insert characters into deque
2. Remove first and last
3. Compare both values

---

# Program Flow

1. Define an input string.
2. Run each palindrome algorithm.
3. Capture execution start time using `System.nanoTime()`.
4. Capture execution end time.
5. Calculate execution time.
6. Display results for each algorithm.

---

# Compilation and Execution

### Compile

```
javac UseCase13PalindromeCheckerApp.java
```

### Run

```
java UseCase13PalindromeCheckerApp
```

---

# Example Output

```
Input : racecar

Simple String Method:
Result : true
Execution Time : 8200 ns

Stack Method:
Result : true
Execution Time : 12000 ns

Deque Method:
Result : true
Execution Time : 9000 ns
```

---

# Learning Outcome

After completing this program you will understand:

* How to **measure execution time in Java**
* How to **compare algorithm performance**
* Differences between **Stack and Deque approaches**
* Practical use of **System.nanoTime()**

---

# Author

Developer

Version: 13.0
