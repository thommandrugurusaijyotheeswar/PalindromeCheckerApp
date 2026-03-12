# UC9 – Recursive Palindrome Checker

## Objective

The objective of this program is to check whether a given string is a **palindrome** using **recursion**.

A palindrome is a word or sequence that reads the same forward and backward.

Examples:

* racecar
* level
* radar

---

# Key Concepts Used

## 1. Recursion

Recursion is a programming technique where a **function calls itself** to solve smaller parts of a problem.

Example structure:

```
isPalindrome(str, start, end)
```

Each recursive call reduces the problem size by moving the start forward and the end backward.

---

## 2. Base Condition

The base condition stops the recursion and prevents infinite calls.

Example:

```
if(start >= end)
return true;
```

When the pointers cross or meet, the string is confirmed as a palindrome.

---

## 3. Call Stack

The **Call Stack** stores function calls during recursion.

Example execution:

```
isPalindrome("racecar",0,6)
isPalindrome("racecar",1,5)
isPalindrome("racecar",2,4)
isPalindrome("racecar",3,3)
```

When the base condition is reached, the function returns back through the call stack.

---

# Program Flow

1. Define the input string.
2. Call the recursive function with start and end indices.
3. Compare characters at both ends.
4. If characters match, call the function recursively.
5. Stop recursion when the base condition is reached.
6. Print whether the string is a palindrome.

---

# Compilation and Execution

### Compile

```
javac UseCase9PalindromeCheckerApp.java
```

### Run

```
java UseCase9PalindromeCheckerApp
```

---

# Example Output

```
Input : racecar
Is Palindrome? : true
```

Example (Not Palindrome)

```
Input : hello
Is Palindrome? : false
```

---

# Data Structure Used

Call Stack

---

# Learning Outcome

After completing this program you will understand:

* How **recursion works**
* Importance of **base condition**
* How the **call stack manages recursive calls**
* How recursion can solve palindrome problems efficiently

---

# Author

Developer

Version: 9.0
