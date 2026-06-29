# Largest in Array

## Problem

Given an array `arr[]`, return the largest element present in the array.

### Example

**Input**

```text
[1, 8, 7, 56, 90]
```

**Output**

```text
90
```

---

## Approach

1. Assume the first element is the largest.
2. Traverse the array from the second element.
3. If the current element is greater than the current maximum, update the maximum.
4. Return the maximum element after completing the traversal.

---

## Algorithm

- Initialize `max = arr[0]`.
- Traverse the array.
- Compare each element with `max`.
- Update `max` whenever a larger element is found.
- Return `max`.

---

## Time Complexity

**O(n)**

The array is traversed only once.

---

## Space Complexity

**O(1)**

No extra space is used.

---

## Tags

- Arrays
- Traversal
- Basic

---