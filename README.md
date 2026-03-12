# UC5 – Stack-Based Palindrome Checker

## 📌 Objective

The objective of this program is to check whether a given string is a **palindrome** using a **Stack data structure**.

A **palindrome** is a word or sequence that reads the same forward and backward.

Examples:

* noon
* madam
* level

This use case demonstrates how a **stack naturally reverses elements using the LIFO principle**, making it useful for palindrome validation.

---

# 🧠 Key Concepts Used

## 1. Stack

A **Stack** is a linear data structure that follows the **Last In First Out (LIFO)** principle.

Example:

```
Push: n → o → o → n
Stack Top → n
```

When popping:

```
Pop → n → o → o → n
```

The order becomes reversed.

---

## 2. Push Operation

The **push()** method inserts elements into the stack.

Example:

```java
stack.push(c);
```

---

## 3. Pop Operation

The **pop()** method removes the top element from the stack.

Example:

```java
stack.pop();
```

---

## 4. Reversal Logic

Stacks reverse the order of elements automatically.
This property helps compare the reversed sequence with the original string.

---

# ⚙️ Program Flow

1. Declare and initialize a string.
2. Create a **Stack** to store characters.
3. Push each character of the string into the stack.
4. Pop characters from the stack.
5. Compare popped characters with the original string.
6. If all characters match, the string is a **Palindrome**.
7. Display the result.

---

# 💻 Compilation and Execution

### Step 1: Compile the Program

Open **Command Prompt** and run:

```
javac UseCase5PalindromeCheckerApp.java
```

### Step 2: Run the Program

```
java UseCase5PalindromeCheckerApp
```

---

# ▶️ Example Output

Example 1:

```
Input: noon
Output: noon is a Palindrome.
```

Example 2:

```
Input: hello
Output: hello is NOT a Palindrome.
```

---

# 📂 File Structure

```
UseCase5PalindromeCheckerApp.java
README.md
```

---

# 📚 Learning Outcome

After completing this program, you will understand:

* How **Stack Data Structure** works
* The **LIFO principle**
* How **push() and pop() operations** work
* How stacks can be used to **reverse data**
* Implementation of palindrome validation using **stack logic**

---

# 👨‍💻 Author

Developer

Version: 5.0
