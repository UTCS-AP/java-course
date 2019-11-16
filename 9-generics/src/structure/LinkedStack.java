package structure;

import structure.linkedlist.LinkedList;

/**
 * This class implements an arbitrary sized stack of arbitrary objects.
 * In fact this is just a wrapper around a LinkedList and uses its insert,
 * get and delete methods to simulate the functionality of a stack via
 * push and pop methods.
 */
public class LinkedStack {
    /** the actual LinkedList structure */
    private LinkedList list = new LinkedList();

    /**
     * Adds another object at the end of the stack.
     * @param o the object to be added
     */
    public void push(Object o) {
        this.list.insert(o);
    }

    /**
     * Removes and gives the object at the end of the stack.
     * @return the last object in the stack, null if it is empty
     */
    public Object pop() {
        Object o = this.list.get();
        this.list.delete();
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
