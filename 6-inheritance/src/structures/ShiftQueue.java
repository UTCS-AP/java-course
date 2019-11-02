package structures;

import data.Person;

public class ShiftQueue extends AbstractFixedQueue {
    private int rear = 0;

    public ShiftQueue(int size) {
        super(size);
    }

    public boolean enqueue(Person person) {
        if (!this.isFull()) {
            this.list[this.rear] = person;
            this.rear++;
            return true;
        } else
            return false;
    }

    public Person dequeue() {
        if (!this.isEmpty()) {
            Person first = this.list[0];
            this.shift();
            return first;
        } else
            return null;
    }

    private void shift() {
    for(int i = 0; i < this.rear - 1; i++)
            this.list[i] = this.list[i+1];
        this.rear--;
    }

    private boolean isEmpty() {
        return (this.rear == 0);
    }

    private boolean isFull() {
        return (this.rear == this.size);
    }
}
