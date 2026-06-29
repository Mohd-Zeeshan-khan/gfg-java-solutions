# Last Digit of a Number

## Problem Statement

Given an integer `n`, return the last digit of the number.

The number may be positive or negative.

---

## Examples

### Example 1

**Input**

```text
10
```

**Output**

```text
0
```

### Example 2

**Input**

```text
9768
```

**Output**

```text
8
```

---

## Approach

1. Read the integer `n`.
2. Find the remainder when dividing the number by `10` using the modulus (`%`) operator.
3. Since negative numbers produce a negative remainder in Java, use `Math.abs()` to convert it to a positive digit.
4. Print the result.

---

## Algorithm

- Input the integer `n`.
- Compute `n % 10`.
- Apply `Math.abs()` to handle negative values.
- Print the last digit.

---

## Time Complexity

**O(1)**

Only one arithmetic operation is performed.

---

## Space Complexity

**O(1)**

No extra memory is used.

---

## Java Code

```java
System.out.println(Math.abs(n % 10));
```

---

## Key Concepts

- Modulus (`%`) Operator
- `Math.abs()`
- User Input using `Scanner`

---

## Tags

- Basic
- Mathematics
- Modulus
- Java

---