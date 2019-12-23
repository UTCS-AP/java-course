package linkedlist;

/**
 * A LinkList structure. Acts as a chain of Node objects, starting from "head".
 * LinkList has a flexible size; You can always add more nodes.
 * Notice that this implementation of LinkList does not store its size.
 * It only knows where to start (the head), how to step forward through the
 * chain (following next node), and when to stop (when a node does'nt have a
 * next one).
 * Also notice that this is the only public class in this package.
 */
public class LinkedList<T> {

    /** First node in the list, null when it's empty. */
    private Node<T> head = null;

    /**
     * Checks whether the list is empty, i.e. head is null.
     *
     * @return true if head is null, false otw.
     */
    public boolean isEmpty() { return (this.head == null); }

    /**
     * Deletes the node at given index by unlinking it from the list,
     * by finding the previous node and moving it's next reference
     *  one node further. Notice that traverseTo(index-1) returns null
     * when (index - 1) is an invalid index, i.e. index <= 0 or
     * index >= last + 2. So two special cases must be considered:
     *    - The case when traverseTo returns null, but it's a valid
     *      delete operation (index = 0),
     *    - and the case when traverseTo returns a node, but it's not
     *      a valid delete operation (index = last index + 1).
     *
     * @param index index of the node to be deleted, starting from 0
     * @return true if a valid index was given, false otw.
     */
    public boolean delete(int index) {
        Node<T> prevNode = this.traverseTo(index - 1);         // <- get the previous node

        if (prevNode == null) {                             // <- (index - 1) is not valid
            if (index != 0 || this.isEmpty())               // <- invalid deletion
                return false;
            else {
                this.head = this.head.getNext();            // <- valid deletion at head
                return true;
            }
        } else if (prevNode.getNext() != null) {            // <- index != last index + 1
            prevNode.setNext(prevNode.getNext().getNext()); // <- move one node further
            return true;
        } else                                              // <- index == last index + 1
            return false;
    }

    /**
     * Deletes the last node in the list.
     *
     * @return true if there is a last node (list is not empty), false otw.
     */
    public boolean delete() {
        if (this.isEmpty())
            return false;
        else {
            Node<T> currentNode = this.head;
            if (currentNode.getNext() == null)              // <- if head is the only node
                this.head = null;
            else {
                Node<T> prevNode;                              // <- keeps the previous node
                do {
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                } while (currentNode.getNext() != null);    // <- while last node not reached
                prevNode.setNext(null);                     // <- set the
            }
            return true;
        }
    }

    /**
     * Inserts the given object to the end of the list.
     *
     * @param object the object to be added
     */
    public void insert(T object) {
        if (this.isEmpty())
            this.head = new Node<T>(object);               // <- set the head
        else
            this.getLast().setNext(new Node<T>(object));   // <- set the next reference of the last node
    }

    /**
     * Inserts the given object at the given index, so the new object
     * will be at the given index AFTER the insertion is done.
     * To insert object 'p' at index 'i', this function first gets a
     * reference like 'r' to the node at index 'i' - 1, creates a new
     * node with object 'p' and sets its next to 'r'.next. Then sets
     * 'r'.next to this new node.
     *                   ___
     *                  | p |
     *                  |___| <new node>
     *                 /  i |
     *            ___ /     |___
     *   ... ____|   |      |   |____ ...
     *           |___| r    |___| r.next
     *            i-1        i+1
     *
     * In the special case where index = 0, there is no previous node,
     * so we just have to set the head to the new node.
     *
     * Notice that a valid index for insertion is between 0 (insert at
     * the beginning) and last index plus one (insert at the end).
     *
     * @param object the object to be added
     * @param index the index at which {@param object} is inserted
     * @return true if the index is valid, false otw.
     */
    public boolean insert(T object, int index) {
        if (index == 0) {
            this.head = new Node<T>(object, this.head);
            return true;
        }
        Node prevNode = this.traverseTo(index - 1);
        if (prevNode != null) {
            prevNode.setNext(new Node<T>(object, prevNode.getNext()));
            return true;
        } else
            return false;
    }

    /**
     * Returns the object (of the node) at given index.
     *
     * @param index index of (node of) the wanted object in the list
     * @return Object of the node at given index
     */
    public T get(int index) {
        Node<T> node = this.traverseTo(index);
        return node == null ? null : node.getObject();
    }

    /**
     * Returns the last (node's) object in the list.
     *
     * @return Object of the last node in the list
     */
    public T get() {
        Node<T> node = this.getLast();
        return node == null ? null : node.getObject();
    }

    /**
     * Returns the node at given index, or null if it is invalid.
     * It first makes sure the index is not negative. Then, starting
     * from head, it moves forward until either the given index or
     * the end of the list is reached (which is indicated by reaching
     * a node whose next reference is null).
     *
     * @param index index of the wanted node in the list
     * @return node at the given index, null if the index is not valid
     */
    private Node<T> traverseTo(int index) {
        Node<T> currentNode = index < 0 ? null : this.head;
        if (currentNode != null) {
            Node nextNode = currentNode.getNext();
            for (int i = 0; i < index; i++) {
                currentNode = nextNode;
                if (currentNode == null)
                    break;
                nextNode = currentNode.getNext();
            }
        }
        return currentNode;
    }


    /**
     * Returns the last node in the list by simply looping over nodes,
     * starting from head, until reaching null.
     *
     * @return last node in the list, null if it is empty
     */
    private Node<T> getLast() {
        Node<T> currentNode = this.head;
        if (currentNode != null) {
            Node<T> nextNode = currentNode.getNext();
            while (nextNode != null) {
                currentNode = nextNode;
                nextNode = currentNode.getNext();
            }
        }
        return currentNode;
    }

    public void doThisWithWholeList(Function<T> function) {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            function.doSomethingWith(currentNode.getObject());
            currentNode = currentNode.getNext();
        }
    }

    public boolean testWholeList(Tester<T> tester) {
        boolean result = true;
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            result &= tester.test(currentNode.getObject());
            currentNode = currentNode.getNext();
        }
        return result;
    }
}
