package linkedlist;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private LinkedList<T> list;
    private Node<T> pointer;

    LinkedListIterator(LinkedList<T> list) {
        this.list = list;
        this.pointer = list.getHead();
    }

    public boolean hasNext() {
        return (this.pointer != null);
    }

    public T next() {
        T object = this.pointer.getObject();
        this.pointer = this.pointer.getNext();
        return object;
    }
}
