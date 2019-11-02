package structures;

import data.Person;

public class CircularQueue extends AbstractFixedQueue {
    private int front = 0;
    private int rear = 0;

    public CircularQueue(int size) {
        super(size + 1);
    }

    public boolean enqueue(Person person) {
        if (this.isFull())
            return false;
        else {
            this.rear = this.modInc(this.rear);
            this.list[this.rear] = person;
            return true;
        }
    }

    public Person dequeue() {
        if (this.isEmpty())
            return null;
        else {
            this.front = this.modInc(this.front);
            return this.list[this.front];
        }
    }

    private int modInc(int p) {
        return (p + 1) % this.size;
    }

    private boolean isEmpty() {
        return (this.front == this.rear);
    }

    private boolean isFull() {
        return (this.front == this.modInc(this.rear));
    }
}
