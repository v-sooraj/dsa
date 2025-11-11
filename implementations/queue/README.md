# Queue

A queue is a First-In-First-Out (FIFO) data structure where elements are added at the back and removed from the front. This folder contains a Java implementation using a circular array and demonstrates common queue concepts.

## Key characteristics
- FIFO ordering: the earliest enqueued element is dequeued first.
- Typical operations are constant time (O(1)) for well-designed implementations.
- Fixed-size array implementations have a maximum capacity; linked-list implementations grow dynamically.

## Basic operations
- `enqueue(value)` — add `value` to the back of the queue. (O(1))
- `dequeue()` — remove and return the front element. Returns `null` or a sentinel if empty. (O(1))
- `peek()` / `top()` — return the front element without removing it. (O(1))
- `isEmpty()` — check whether the queue has no elements. (O(1))
- `isFull()` — (for fixed-size queues) check whether the queue reached capacity. (O(1))

## Common implementations
- Array (linear): simple but can waste space after repeated dequeues unless elements are shifted.
- Circular array: reuses freed slots by wrapping indices using modulo arithmetic — efficient and fixed-capacity.
- Linked list: no fixed capacity, nodes hold next pointers; enqueue/dequeue at tail/head are O(1).
- Two-stack approach: implement a queue using two stacks to achieve amortized O(1) operations.
- Priority queue: not strictly FIFO — elements are ordered by priority.

## Circular-array notes
- Use modulo arithmetic for indices: `index = (index + 1) % capacity`.
- Track `front`, `back` and `size` (or count) to manage state and detect full/empty conditions.
- Common behaviours: return `null` on dequeue/peek when empty; ignore enqueue when full (or throw an exception depending on design).

## Usage example (Java)
```java
// Example usage with the circular-array Queue implementation in this folder
Queue<Integer> q = new Queue<>(5);
q.enqueue(10);
q.enqueue(20);
int head = q.top();      // 10
int removed = q.dequeue(); // 10
boolean empty = q.isEmpty();