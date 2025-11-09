# Stack Module

Simple generic stack implementation using Array.

## What is a stack ?
A stack is a linear data structure that follows Last-In, 
First-Out (LIFO) order — the most recently added element is the 
first to be removed. Stack can be implemented using arrays or linked lists.
Common stack operations:
- push: add an element to the top
- pop: remove and return the top element
- peek/top: return the top element without removing it
- isEmpty / isFull: query stack state

Use-cases: expression evaluation, backtracking (DFS), undo mechanisms, call stacks, parsing.

## Overview
This module provides a simple, array-backed generic `Stack<V>` implementation located at `stack/src/Stack.java`. The stack supports basic operations: push, pop, top (peek), isEmpty, and isFull. It uses a fixed maximum capacity provided at construction.

## Features
- Generic stack: `Stack<V>`
- Fixed maximum capacity specified at construction
- Fail-fast behavior: operations throw `IllegalStateException` on invalid states (e.g., push on full stack, pop on empty stack)
- Minimal, dependency-free implementation suitable for learning and small projects

## Usage

```java
// Example usage
Stack<Integer> s = new Stack<>(5);
s.push(10);
s.push(20);
int top = s.top();     // 20
int popped = s.pop();  // 20
boolean empty = s.isEmpty();
boolean full = s.isFull();

```
### Notes
- This is a basic stack implementation for educational purposes. For production use, consider using Java's built-in `Deque` or `Stack` classes from the Java Collections Framework.
- The stack has a fixed size; attempting to push onto a full stack or pop from an empty stack will result in an exception.
- This implementation does not support dynamic resizing.

### TEMPORARY: REMOVE LATER
This section contains helpful, but removable, artifacts for development and quick testing:
Quick test data:
push sequence: [1,2,3,4,5]
expected top after pushes: 5
expected pop sequence: 5,4,3,2,1
Local debug commands:
javac -d out implementations/stack/src/Stack.java
java -cp out your.package.Main
Development checklist:
<input></input>Add JUnit tests for boundary conditions
<input></input>Add null-handling note if needed
<input></input>Consider dynamic resizing or wrapper using ArrayDeque
Notes for removal: delete the whole "TEMPORARY: REMOVE LATER" section before finalizing the module or when migrating tests into CI.
Tests
Add JUnit tests covering:
pushing until full
popping until empty
peek/top behavior on empty stack
generic typing behavior