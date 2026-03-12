# UC11 – Object-Oriented Palindrome Service

## Objective

The objective of this program is to check whether a string is a **palindrome using Object-Oriented Programming (OOP) principles**.

The palindrome logic is encapsulated inside a **PalindromeChecker class**, improving modularity and code reuse.

---

# Key Concepts Used

## 1. Encapsulation

Encapsulation means **wrapping data and methods inside a class**.

In this program:

```
PalindromeChecker class
```

contains the palindrome checking logic inside the method:

```
checkPalindrome()
```

---

## 2. Single Responsibility Principle

Each class should have **only one responsibility**.

In this program:

| Class                         | Responsibility         |
| ----------------------------- | ---------------------- |
| PalindromeChecker             | Check palindrome logic |
| UseCase11PalindromeCheckerApp | Run the application    |

This improves **code organization and maintainability**.

---

## 3. Object Creation

An object of the PalindromeChecker class is created in the main method.

Example:

```
PalindromeChecker checker = new PalindromeChecker();
```

The method is then called using the object.

---

# Program Flow

1. Create a **PalindromeChecker class**.
2. Implement the **checkPalindrome() method**.
3. Compare characters from the start and end of the string.
4. Return **true** if the string is a palindrome.
5. In the main class, create an object of the checker class.
6. Call the method and display the result.

---

# Compilation and Execution

### Compile

```
javac UseCase11PalindromeCheckerApp.java
```

### Run

```
java UseCase11PalindromeCheckerApp
```

---

# Example Output

```
Input : radar
Is Palindrome? : true
```

Example (Not Palindrome)

```
Input : hello
Is Palindrome? : false
```

---

# Data Structure Used

Internal (String / Array comparison)

---

# Learning Outcome

After completing this program you will understand:

* **Encapsulation in Java**
* **Class and Object design**
* **Single Responsibility Principle**
* How to separate **logic and application code**

---

# Author

Developer

Version: 11.0
