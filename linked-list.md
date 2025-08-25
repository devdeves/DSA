# Linked List

A **Linked List** is a linear data structure in which elements (called **nodes**) are connected using **pointers**.  
Each node contains:
- **Value**: the actual data
- **Reference/Pointer**: to the next node (and optionally to the previous node in doubly linked lists)

---

## Types of Linked Lists

### 1. Singly Linked List
- **Value**: the data part  
- **Next**: a pointer/reference to the next node  
- Moves only in **one direction (forward)**  

**Structure:**  
```
[value | next] -> [value | next] -> [value | null]
```

---

### 2. Doubly Linked List
- **Value**: the data  
- **Next**: pointer to the next node  
- **Prev**: pointer to the previous node  
- Allows **bidirectional traversal**  

**Structure:**  
```
null <- [prev | value | next] <-> [prev | value | next] -> null
```

---

## Key Terminologies
- **Head**: The first node of a linked list. It marks the entry point and points to the next node.  
- **Tail**: The last node of a linked list. It points to `null` because there’s no node after it.  
- **Linked List Representation**: Typically represented using its **head node**.  

---

## Array vs Linked List — Comparison Table

| Feature              | Array                                                                 | Linked List                                                                 |
|----------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Type**             | Linear data structure where elements are arranged in a sequence using indexes. | Linear data structure where each element (node) points to the next, forming a chain. |
| **Memory Layout**    | Elements stored in a contiguous (adjacent) block of memory.           | Each node stored separately and connected via pointers, allowing scattered memory locations. |
| **Size**             | Fixed or must be defined initially. Resizing is expensive.            | Dynamic. Nodes can be added or removed without knowing the size in advance. |
| **Data Stored**      | Only values (e.g., integers, strings, etc.).                         | Each node stores a value **plus one or more pointers** (next/prev). |
| **Access Time**      | Direct access via index (e.g., `arr[3]`) → **O(1)**                  | Sequential access only. Must traverse from head → **O(n)** |
| **Insertion/Deletion** | Requires shifting elements, can be costly.                         | Faster insertion/deletion (just pointer changes). Efficient at head/tail. |
| **Memory Efficiency** | Efficient, no extra space for pointers.                             | Less memory-efficient (extra space needed for pointers). |

---

## Use Cases: When to Use What?

| Use Case                                | Prefer |
|-----------------------------------------|--------|
| **Access elements by index fast**       | Array – Direct access (`O(1)`), ideal for frequent random access. |
| **Frequent insertions/deletions at head or tail** | Linked List – Efficient (`O(1)`), just change pointers. |
| **Static-sized data with memory-efficient storage** | Array – Best when element count is fixed/predictable. |
| **Unknown size or avoid resizing overhead** | Linked List – Grows dynamically, avoids resizing costs. |
| **Do a lot of traversal/manipulation**  | Linked List – Better flexibility for moving, inserting, deleting nodes. |

---
