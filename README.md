# Binary Tree – Patient Management System

A Java console application that implements a **Binary Search Tree (BST)** for managing patient records. This project was developed to practice data structures, recursion, and object-oriented programming concepts in Java.

## Features

- Add patients to the binary search tree
- Search patients by protocol number
- Remove patients while maintaining BST properties
- Display patient records in sorted order
- Interactive console menu

## Project Structure

```text
src/
├── application/
│   └── BinaryTreeMain.java
├── data_structure/
│   ├── BinaryTree.java
│   └── Node.java
└── entities/
    └── Patient.java
```

## How It Works

Each patient is identified by a unique protocol number, which is used as the key in the Binary Search Tree.

- Smaller protocol numbers are stored in the left subtree.
- Larger protocol numbers are stored in the right subtree.
- Search, insertion, and removal operations are performed recursively.
- In-order traversal displays records in ascending order.

## Technologies

- Java
- Object-Oriented Programming (OOP)
- Binary Search Tree (BST)
- Recursion
