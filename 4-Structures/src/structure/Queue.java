package structure;

import data.Person;

/**
 * A simple fixed-size circular queue structures, for objects of type Person.
 */
public class Queue {
    /** A default size to use when the input size is inappropriate */
    final static private int DEFAULT_SIZE = 10;

    /** The FIXED size of the stack */
    final private int size;

    /** Index of the first person in the queue */
    private int front = 0;

    /** Index of the  last person in the queue + 1 */
    private int rear = 0;

    /** The actual list of Persons. One element is always unused. So list's size will be one plus queue size. */
    private Person[] list;

    /**
     * Creates a new queue of the given size, only if it's not negative.
     * The internal array actually has one element more than the queue size,
     * always unused, which only lets us determine whether the queue is full
     * or empty.
     * @param size the fixed size of the stack
     */
    public Queue(int size) {
        if (0 <= size)  // use the given size only if it is not negative
            this.size = size + 1;
        else    // else, use the default size
            this.size = Queue.DEFAULT_SIZE + 1;
        this.list = new Person[this.size];
    }

    /**
     * Adds another Person to the queue, moves the rear pointer accordingly.
     * @param person Person instance to be added
     * @return true if the queue has room left, false otherwise
     */
    public boolean enqueue(Person person) {
        if (this.isFull())
            return false;
        else {
            this.rear = this.modInc(this.rear);
            this.list[this.rear] = person;
            return true;
        }
    }

    /**
     * Removes and returns the next Person in the queue, moves the front pointer accordingly.
     * @return next Person instance in the queue, null if the queue is empty
     */
    public Person dequeue() {
        if (this.isEmpty())
            return null;
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
