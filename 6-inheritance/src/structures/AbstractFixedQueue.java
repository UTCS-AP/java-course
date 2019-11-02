package structures;

import data.Person;

public class AbstractFixedQueue {
    final static private int DEFAULT_SIZE = 10;

    final protected int size;

    protected Person[] list;

    AbstractFixedQueue(int size) {
        if (0 <= size)  // use the given size only if it is not negative
            this.size = size;
        else    // else, use the default size
            this.size = AbstractFixedQueue.DEFAULT_SIZE;
        this.list = new Person[this.size];
    }

    public boolean enqueue(Person person) { return false; }

    public Person dequeue() { return null; }
}
