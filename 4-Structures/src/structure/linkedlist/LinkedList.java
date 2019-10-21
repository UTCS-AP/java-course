package structure.linkedlist;

import data.Person;

/**
 * A LinkList structure. Acts as a chain of Node objects, starting from "head".
 * LinkList has a flexible size; You can always add more nodes.
 */
public class LinkedList {

    private Node head = null;

    public boolean isEmpty() { return (this.head == null); }

    public boolean delete(int index) {
        if (this.isEmpty())
            return false;
        else if (index == 0) {
            this.head = this.head.getNext();
            return true;
        } else {
            Node prevNode = this.traverseTo(index - 1);
            prevNode.setNext(prevNode.getNext().getNext());
            return true;
        }
    }

    public boolean delete() {
        if (this.isEmpty())
            return false;
        else {
            Node currentNode = this.head;
            Node nextNode = currentNode.getNext();
            if (nextNode == null)
                this.head = null;
            else {
                Node prevNode;
                do {
                    prevNode = currentNode;
                    currentNode = nextNode;
                    nextNode = currentNode.getNext();
                } while (nextNode != null);
                prevNode.setNext(null);
            }
            return true;
        }
    }

    public void insert(Person person) {
        if (this.isEmpty())
            this.head = new Node(person);
        else
            this.getLast().setNext(new Node(person));
    }

    public boolean insert(Person person, int index) {
        Node prevNode = this.traverseTo(index - 1);
        if (prevNode != null) {
            prevNode.setNext(new Node(person, prevNode.getNext()));
            return true;
        } else {
            return false;
        }
    }

    public Person get(int index) {
        Node node = this.traverseTo(index);
        return node == null ? null : node.getPerson();
    }

    public Person get() {
        Node node = this.getLast();
        return node == null ? null : node.getPerson();
    }

    private Node traverseTo(int index) {
        Node currentNode = this.head;
        if (currentNode != null) {
            Node nextNode = currentNode.getNext();
            for (int i = 0; i < index && nextNode != null; i++) {
                currentNode = nextNode;
                nextNode = currentNode.getNext();
            }
        }
        return currentNode;
    }


    private Node getLast() {
        Node currentNode = this.head;
        if (currentNode != null) {
            Node nextNode = currentNode.getNext();
            while (nextNode != null) {
                currentNode = nextNode;
                nextNode = currentNode.getNext();
            }
        }
        return currentNode;
    }
}
