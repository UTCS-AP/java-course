package structure;

import java.util.Arrays;

/**
 * A simple fixed-size circular queue structures, for objects of type T.
 */
public class Queue<T> {
    /** A default size to use when the input size is inappropriate */
    final static private int DEFAULT_SIZE = 10;

    /** The FIXED size of the stack */
    final private int size;

    /** Index of the first object in the queue */
    private int front = 0;

    /** Index of the  last object in the queue + 1 */
    private int rear = 0;

    /** The actual list of objects. One element is always unused. So list's size will be one plus queue size. */
    private T[] list;

    /**
     * Creates a new queue of the given size, only if it's not negative.
     * The internal array actually has one element more than the queue size,
     * always unused, which only lets us determine whether the queue is full
     * or empty.
     * @param size the fixed size of the stack
     * @throws NegativeArraySizeException if size is negative
     */
    public Queue(int size) throws NegativeArraySizeException {
        if (size < 0)  // use the given size only if it is not negative
            throw new NegativeArraySizeException("Could not create a queue of size " + size + ".");

        this.size = size + 1;
        this.list = (T[]) new Object[this.size];
    }

    /**
     * Adds another object to the queue, moves the rear pointer accordingly.
     * @param t T instance to be added
     * @throws QueueFullException if the queue is full
     */
    public void enqueue(T t) throws QueueFullException {
        if (this.isFull())
            throw new QueueFullException("Could not add " + t.toString() +". The queue is full!");
        else {
            this.rear = this.modInc(this.rear);
            this.list[this.rear] = t;
        }
    }

    /**
     * Removes and returns the next object in the queue, moves the front pointer accordingly.
     * @return next object in the queue, null if the queue is empty
     */
    public T dequeue() throws QueueEmptyException {
        if (this.isEmpty())
            throw new QueueEmptyException();
        else {
            this.front = this.modInc(this.front);
            return this.list[this.front];
        }
    }

    /**
     * Increases given integer circularly, modulo queue size.
     * @param p integer to be increased
     * @return increased integer
     */
    private int modInc(int p) {
        return (p + 1) % this.size;
    }

    /**
     * Checks if queue is empty, i.e. front coincides with rear.
     * @return true if the queue is empty, false otherwise
     */
    private boolean isEmpty() {
        return (this.front == this.rear);
    }

    /**
     * Checks if queue is full, i.e. rear will coincide with front after increment.
     * @return true if the queue is full, false otherwise
     */
    private boolean isFull() {
        return (this.front == this.modInc(this.rear));
    }
}
