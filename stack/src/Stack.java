public class Stack<V> {

    private final int maxSize;
    private final V[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.maxSize = size; // Set maximum size of the stack
        this.stackArray = (V[]) new Object[maxSize]; // Create stack array with given size
        this.top = -1; // Initialize top to -1 indicating an empty stack
    }

    public boolean isEmpty() {
        return top == -1; // Stack is empty if top is -1
    }

    public boolean isFull() {
        return top == maxSize - 1; // Stack is full if top is at maxSize - 1
    }

    public V top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top]; // Return the top element of the stack
    }

    public void push(V value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++top] = value; // Increment top and add the new value
    }
    public V pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top--]; // Return the top element and decrement top
    }
}
