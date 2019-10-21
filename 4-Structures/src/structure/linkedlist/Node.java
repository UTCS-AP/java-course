package structure.linkedlist;

import data.Person;

/**
 * A Node object is a pair, consists of a Person reference, and another Node reference.
 * So Node objects can gather as a chain, such that each one keeps a reference to the
 * next Node in the chain. A LinkList object can hold and maintain such chain.
 */
class Node {
    /** Persons object of this node */
    private Person person;

    /** Reference to the next node in the chain, null when this is the last node. */
    private Node next;

    /**
     * Creates new Node object, with given Person, next is null until explicitly set
     * by setNext().
     * @param person Person instance of this Node
     */
    Node(Person person) {
        this.person = person;
        this.next = null;
    }

    /**
     * Creates new Node object, with given Person and Node objects.
     * @param person Person instance of this Node
     * @param next next Node of this Node in the chain
     */
    Node(Person person, Node next) {
        this.person = person;
        this.next = next;
    }

    /**
     * @return Person instance of this node
     */
    Person getPerson() {
        return this.person;
    }


    /**
     * @return Next node in the chain, or null if this is the last node in the chain.
     */
    Node getNext() {
        return this.next;
    }

    /**
     * Set next node of this node
     * @param next next node
     */
    void setNext(Node next) {
        this.next = next;
    }


    /**
     * Whether this is the last node in the chain, i.e. this.next is null.
     * @return true if this is the last node, false otw.
     */
    boolean isLast() {
        return (this.next == null);
    }
}
