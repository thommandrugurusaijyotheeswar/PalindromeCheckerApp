# UC4 – Character Array Based Palindrome Check

## 📌 Objective

The objective of this program is to check whether a given string is a **palindrome** by converting the string into a **character array (char[])** and comparing characters using the **two-pointer technique**.

A **palindrome** is a word or sequence that reads the same forward and backward.

Examples:

* radar
* madam
* level

---

## 🧠 Key Concepts Used

### 1. Character Array (char[])

A **char[]** is used to store individual characters of a string.
This allows direct access to characters using index positions.

### 2. Array Indexing

Characters are accessed using index numbers starting from **0**.

Example:

```
r a d a r
0 1 2 3 4
```

### 3. Two-Pointer Technique

Two pointers are used:

* **start** → begins at the first character
* **end** → begins at the last character

The program compares characters from both ends and moves the pointers toward the center.

### 4. Time Efficiency

This approach avoids creating extra string objects and performs comparisons efficiently.

---

## ⚙️ Program Flow

1. Declare and initialize a string.
2. Convert the string into a **character array** using `toCharArray()`.
3. Set two pointers:

    * `start = 0`
    * `end = length - 1`
4. Compare characters at both positions.
5. If characters match, move the pointers inward.
6. If characters do not match, the string is **not a palindrome**.
7. Display the result.

---

## 💻 Compilation and Execution

### Step 1: Compile the Program

Open **Command Prompt** and run:

```
javac UseCase4PalindromeCheckerApp.java
```

### Step 2: Run the Program

```
java UseCase4PalindromeCheckerApp
```

---

## ▶️ Example Output

```
radar is a Palindrome.
```

Example (Not Palindrome):

```
hello is NOT a Palindrome.
```

---

## 📂 File Structure

```
UseCase4PalindromeCheckerApp.java
README.md
```

---

## 📚 Learning Outcome

After completing this program, you will understand:

* How to convert a string into a **character array**
* How to use **array indexing**
* How the **two-pointer technique** works
* Efficient ways to compare characters in Java

---

## 👨‍💻 Author

Developer

Version: 4.0
