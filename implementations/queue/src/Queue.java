/**
 * A generic Queue implementation using a circular array.
 *
 * @param <V> The type of elements held in this queue.
 */
public class Queue<V> {

    // Array to store the elements of the queue
    private final V[] array;
    // Index of the front element in the queue
    private int front;
    // Index of the back element in the queue
    private int back;
    // Maximum size of the queue
    private final int maxSize;
    // Current number of elements in the queue
    private int currentSize;

    /**
     * Constructs a Queue with a specified maximum size.
     *
     * @param maxSize The maximum number of elements the queue can hold.
     */
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = (V[]) new Object[maxSize];
        front = 0;
        back = -1;
        currentSize = 0;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false otherwise.
     */
    public boolean isFull() {
        return currentSize == maxSize;
    }

    /**
     * Retrieves the element at the front of the queue without removing it.
     *
     * @return The front element of the queue, or null if the queue is empty.
     */
    public V top() {
        if (isEmpty())
            return null;
        return array[front];
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param value The element to be added to the queue.
     *              If the queue is full, the operation is ignored.
     */
    public void enqueue(V value) {
        if (isFull())
            return;
        back = (back + 1) % maxSize;
        array[back] = value;
        currentSize++;
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return The front element of the queue, or null if the queue is empty.
     */
    public V dequeue() {
        if (isEmpty())
            return null;
        V temp = array[front];
        array[front] = null;
        front = (front + 1) % maxSize;
        currentSize--;
        return temp;
    }

}