package structure;

import structure.linkedlist.LinkedList;

/**
 * This class implements an arbitrary sized queue of arbitrary objects.
 * In fact this is just a wrapper around a LinkedList and uses its insert,
 * get and delete methods to simulate the functionality of a queue via
 * enqueue and dequeue methods.
 */
public class LinkedQueue<T> implements Queue<T> {
    /** the actual LinkedList structure */
    private LinkedList<T> list = new LinkedList<T>();

    /**
     * Adds another object at the end of the queue.
     * @param o the object to be added
     */
    public void enqueue(T o) {
        this.list.insert(o);
    }

    /**
     * Removes and gives the object at the front of the queue.
     * @return the first object in the queue, null if it is empty
     */
    public T dequeue() {
        T o = this.list.get(0);
        this.list.delete(0);
        return o;
    }

    /**
     * Checks if the queue is empty.
     * @return true if list is empty, false otw.
     */
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
