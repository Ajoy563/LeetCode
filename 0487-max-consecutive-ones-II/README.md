# 487. Max Consecutive Ones II
**Medium**

---

## Problem

You are given a binary array `nums`. You may flip **at most one `0`** to `1`.

Return the maximum number of consecutive `1`s in the array after flipping at most one `0`.

---

### Example 1:

**Input:**
```text
nums = [1,0,1,1,0]
```

**Output:**
```text
4
```

**Explanation:** Flip the first `0` to `1`. The array becomes `[1,1,1,1,0]`, giving four consecutive `1`s.

---

### Example 2:

**Input:**
```text
nums = [1,0,1,1,0,1]
```

**Output:**
```text
4
```

**Explanation:** After flipping one `0`, the maximum number of consecutive `1`s is `4`.

---

### Example 3:

**Input:**
```text
nums = [1,1,1,1]
```

**Output:**
```text
4
```

**Explanation:** The array already contains four consecutive `1`s, so no flip is necessary.

---

### Example 4:

**Input:**
```text
nums = [0,0,0,0]
```

**Output:**
```text
1
```

**Explanation:** Only one `0` can be flipped, so the maximum number of consecutive `1`s is `1`.

---

### Constraints:

- `1 <= nums.length <= 10^5`
- `nums[i]` is either `0` or `1`.

---

### Key Point / Pattern:

- **Sliding Window**
- **Two Pointers**
- The current window can contain **at most one `0`**.

---

### Follow-up:

Can you solve this problem in **O(n)** time and **O(1)** extra space?
