# UC12 – Strategy Pattern for Palindrome Algorithms

## Objective

The objective of this program is to implement palindrome validation using the **Strategy Design Pattern**, allowing different palindrome algorithms to be selected dynamically at runtime.

This improves **flexibility, maintainability, and scalability** of the application.

---

# Key Concepts Used

## 1. Interface

An **interface** defines a contract that multiple classes can implement.

Example:

```
interface PalindromeStrategy
```

All palindrome algorithms implement this interface.

---

## 2. Polymorphism

Polymorphism allows different classes to be treated as the same type.

Example:

```
PalindromeStrategy strategy = new StackStrategy();
```

or

```
PalindromeStrategy strategy = new DequeStrategy();
```

Both strategies follow the same interface.

---

## 3. Strategy Pattern

The **Strategy Pattern** allows selecting an algorithm at runtime.

Instead of hardcoding logic, the algorithm is injected dynamically.

Example:

```
PalindromeService service = new PalindromeService(strategy);
```

The service executes the chosen strategy.

---

# Implemented Strategies

### 1. Stack Strategy

Uses a **Stack (LIFO)** to reverse characters.

Steps:

1. Push characters into stack
2. Pop characters
3. Compare with original sequence

---

### 2. Deque Strategy

Uses a **Deque** to compare front and rear characters.

Steps:

1. Insert characters into deque
2. Remove first and last
3. Compare values

---

# Program Flow

1. Define **PalindromeStrategy interface**.
2. Implement algorithm classes:

    * StackStrategy
    * DequeStrategy
3. Create **PalindromeService class** that accepts a strategy.
4. Inject the desired strategy at runtime.
5. Execute palindrome validation.

---

# Compilation and Execution

### Compile

```
javac UseCase12PalindromeCheckerApp.java
```

### Run

```
java UseCase12PalindromeCheckerApp
```

---

# Example Output

```
Input : level
Is Palindrome? : true
```

Example (Not Palindrome)

```
Input : hello
Is Palindrome? : false
```

---

# Data Structures Used

Depending on strategy:

* **Stack**
* **Deque**

---

# Learning Outcome

After completing this program you will understand:

* **Interfaces in Java**
* **Polymorphism**
* **Strategy Design Pattern**
* How to **switch algorithms dynamically**
* Advanced object-oriented design principles

---

# Author

Developer

Version: 12.0
