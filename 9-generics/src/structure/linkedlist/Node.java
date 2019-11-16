package structure.linkedlist;

/**
 * A Node object is a pair, consists of an Object reference, and another Node reference.
 * So Node objects can gather as a chain, such that each one keeps a reference to the
 * next Node in the chain. A LinkList object can hold and maintain such chain.
 */
class Node {
    /** Object of this node */
    private Object object;

    /** Reference to the next node in the chain, null when this is the last node. */
    private Node next;

    /**
     * Creates new Node object, with given Object, next is null until explicitly set
     * by setNext().
     * @param object Object of this Node
     */
    Node(Object object) {
        this.object = object;
        this.next = null;
    }

    /**
     * Creates new Node object, with given Object and Node objects.
     * @param object Object of this Node
     * @param next next Node of this Node in the chain
     */
    Node(Object object, Node next) {
        this.object = object;
        this.next = next;
    }

    /**
     * @return Object of this node
     */
    Object getObject() {
        return this.object;
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
