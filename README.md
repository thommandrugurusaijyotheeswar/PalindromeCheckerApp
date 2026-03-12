# UC7 – Deque-Based Optimized Palindrome Checker

## 📌 Objective

The objective of this program is to check whether a given string is a **palindrome** using a **Deque (Double Ended Queue)** data structure.

A **palindrome** is a word or sequence that reads the same forward and backward.

Examples:

* level
* radar
* civic

This use case demonstrates how a **Deque allows insertion and deletion from both front and rear**, making palindrome comparison efficient.

---

# 🧠 Key Concepts Used

## 1. Deque (Double Ended Queue)

A **Deque** is a linear data structure that allows insertion and deletion from **both ends**.

Operations supported:

* Insert at **front**
* Insert at **rear**
* Remove from **front**
* Remove from **rear**

Example:

```
Input: level

Deque:
Front → l → e → v → e → l ← Rear
```

---

## 2. Front and Rear Access

Deque allows direct access to:

* **First element**
* **Last element**

These elements are compared to check palindrome condition.

Example:

```
Compare:
First = l
Last  = l
```

---

## 3. Optimized Data Handling

Unlike stack-based approaches, **Deque eliminates the need for separate reversal data structures** because both ends can be accessed directly.

This makes the algorithm **simpler and efficient**.

---

# ⚙️ Program Flow

1. Declare and initialize the input string.
2. Create a **Deque** to store characters.
3. Insert all characters of the string into the deque.
4. Remove the **first and last characters**.
5. Compare both characters.
6. If characters match, continue comparison.
7. If characters do not match, the string is **not a palindrome**.
8. Display the final result.

---

# 💻 Compilation and Execution

### Step 1: Compile the Program

Open **Command Prompt** and run:

```
javac UseCase7PalindromeCheckerApp.java
```

### Step 2: Run the Program

```
java UseCase7PalindromeCheckerApp
```

---

# ▶️ Example Output

Example 1:

```
Input : level
Is Palindrome? : true
```

Example 2:

```
Input : hello
Is Palindrome? : false
```

---

# 📂 File Structure

```
UseCase7PalindromeCheckerApp.java
README.md
```

---

# 📚 Learning Outcome

After completing this program, you will understand:

* How **Deque (Double Ended Queue)** works
* How to access **front and rear elements**
* Efficient **palindrome validation**
* How data structures optimize algorithm design

---

# 👨‍💻 Author

Developer

Version: 7.0
