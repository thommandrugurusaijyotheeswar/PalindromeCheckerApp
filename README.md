# UC8 – Linked List Based Palindrome Checker

## Objective

The objective of this program is to check whether a given string is a **palindrome** using a **Singly Linked List** data structure.

A palindrome is a word or sequence that reads the same forward and backward.

Examples:

* madam
* level
* radar

---

# Key Concepts Used

## 1. Singly Linked List

A **Singly Linked List** is a dynamic data structure where each element (node) contains:

* Data
* Reference to the next node

Example structure:

```
m → a → d → a → m → null
```

---

## 2. Node Traversal

Nodes are accessed sequentially using the `next` reference.

Example traversal:

```
current = head
while(current != null)
```

---

## 3. Fast and Slow Pointer Technique

Two pointers are used to find the middle of the linked list.

* **Slow pointer** moves one step
* **Fast pointer** moves two steps

This helps identify the midpoint efficiently.

---

## 4. In-Place Reversal

The second half of the linked list is reversed without creating extra memory structures.

Example:

```
Original second half:
a → m

Reversed:
m → a
```

---

# Program Flow

1. Convert the input string into a **linked list**.
2. Use **fast and slow pointers** to find the middle.
3. Reverse the **second half of the linked list**.
4. Compare the first half and reversed second half.
5. If all characters match → **Palindrome**
6. Otherwise → **Not Palindrome**

---

# Compilation and Execution

### Compile

```
javac UseCase8PalindromeCheckerApp.java
```

### Run

```
java UseCase8PalindromeCheckerApp
```

---

# Example Output

```
Input : madam
Is Palindrome? : true
```

```
Input : hello
Is Palindrome? : false
```

---

# Data Structure Used

Singly Linked List

---

# Learning Outcome

After completing this program you will understand:

* How **Linked Lists** work
* Node creation and traversal
* **Fast and slow pointer technique**
* **In-place reversal algorithm**
* Linked list based palindrome validation

---

# Author

Developer

Version: 8.0
