# UC10 – Case-Insensitive & Space-Ignored Palindrome Checker

## Objective

The objective of this program is to check whether a string is a **palindrome while ignoring spaces and letter case differences**.

This allows phrases such as:

* "Never Odd Or Even"
* "A man a plan a canal Panama"

to be detected as palindromes.

---

# Key Concepts Used

## 1. String Preprocessing

Before checking the palindrome condition, the string is **normalized** by:

* Removing spaces
* Converting all letters to lowercase

Example:

```
Original Input:
Never Odd Or Even

Normalized String:
neveroddoreven
```

---

## 2. Regular Expressions

Regular expressions are used to remove spaces from the string.

Example:

```
input.replaceAll("\\s+", "")
```

Explanation:

* `\\s+` → matches one or more whitespace characters
* `replaceAll()` removes them from the string

---

## 3. Case Normalization

To avoid case mismatch, the string is converted to lowercase.

Example:

```
input.toLowerCase()
```

This ensures:

```
"Madam" == "madam"
```

---

# Program Flow

1. Read the input string from the user.
2. Normalize the string:

    * Remove spaces using regular expressions
    * Convert all letters to lowercase.
3. Reverse the normalized string.
4. Compare the normalized string with the reversed string.
5. If both match → **Palindrome**
6. Otherwise → **Not Palindrome**

---

# Compilation and Execution

### Compile

```
javac UseCase10PalindromeCheckerApp.java
```

### Run

```
java UseCase10PalindromeCheckerApp
```

---

# Example Output

Example 1:

```
Enter a string: Never Odd Or Even
Result: The string is a Palindrome.
```

Example 2:

```
Enter a string: Hello World
Result: The string is NOT a Palindrome.
```

---

# Data Structure Used

String / Array

---

# Learning Outcome

After completing this program you will understand:

* **String preprocessing techniques**
* Use of **regular expressions**
* Case-insensitive comparisons
* How to improve palindrome validation logic

---

# Author

Developer

Version: 10.0
