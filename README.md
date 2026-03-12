# UC6 – Queue + Stack Based Palindrome Check

## 📌 Objective

The objective of this program is to check whether a given string is a **palindrome** using both **Queue** and **Stack** data structures.
This use case demonstrates the difference between **FIFO (First In First Out)** and **LIFO (Last In First Out)** behaviors.

A **palindrome** is a word or sequence that reads the same forward and backward.

Examples:

* civic
* level
* radar

---

# 🧠 Key Concepts Used

## 1. Queue

A **Queue** is a linear data structure that follows the **First In First Out (FIFO)** principle.

Example:

```
Input: c i v i c

Queue Order:
Front → c → i → v → i → c
```

Operations used:

* **enqueue (add)** → insert element into queue
* **dequeue (remove)** → remove element from queue

---

## 2. Stack

A **Stack** is a linear data structure that follows the **Last In First Out (LIFO)** principle.

Example:

```
Stack Top
   c
   i
   v
   i
   c
```

Operations used:

* **push()** → insert element
* **pop()** → remove element

---

## 3. Stack vs Queue Comparison

| Data Structure | Principle | Operation         |
| -------------- | --------- | ----------------- |
| Queue          | FIFO      | enqueue / dequeue |
| Stack          | LIFO      | push / pop        |

In this program:

* The **queue returns characters in original order**
* The **stack returns characters in reverse order**

Comparing both helps determine whether the string is a palindrome.

---

# ⚙️ Program Flow

1. Declare and initialize the input string.
2. Create a **Queue** and **Stack**.
3. Insert each character of the string into both structures.
4. Dequeue from the queue and pop from the stack.
5. Compare both characters.
6. If all characters match → **Palindrome**
7. Otherwise → **Not Palindrome**

---

# 💻 Compilation and Execution

### Step 1: Compile the Program

Open **Command Prompt** and run:

```
javac UseCase6PalindromeCheckerApp.java
```

### Step 2: Run the Program

```
java UseCase6PalindromeCheckerApp
```

---

# ▶️ Example Output

Example:

```
Input : civic
Is Palindrome? : true
```

Example (Not Palindrome):

```
Input : hello
Is Palindrome? : false
```

---

# 📂 File Structure

```
UseCase6PalindromeCheckerApp.java
README.md
```

---

# 📚 Learning Outcome

After completing this program, you will understand:

* How **Queue (FIFO)** works
* How **Stack (LIFO)** works
* Difference between **queue and stack**
* How data structures can be used to solve **palindrome problems**
* Practical use of **enqueue, dequeue, push, and pop operations**

---

# 👨‍💻 Author

Developer

Version: 6.0
