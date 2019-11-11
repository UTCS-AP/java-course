package structure.bintree.nll;

import structure.bintree.TreeNode;


/**
 * Same as structure.linkedlist.LinkedList, except that instead of a list of Persons,
 * it is a list of TreeNodes.
 */
public class LinkedList {

    private Node head = null;

    public boolean isEmpty() { return (this.head == null); }

    public boolean delete(int index) {
        Node prevNode = this.traverseTo(index - 1);

        if (prevNode == null) {
            if (index != 0 || this.isEmpty())
                return false;
            else {
                this.head = this.head.getNext();
                return true;
            }
        } else if (prevNode.getNext() != null) {
            prevNode.setNext(prevNode.getNext().getNext());
            return true;
        } else
            return false;
    }

    public boolean delete() {
        if (this.isEmpty())
            return false;
        else {
            Node currentNode = this.head;
            if (currentNode.getNext() == null)
                this.head = null;
            else {
                Node prevNode;
                do {
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                } while (currentNode.getNext() != null);
                prevNode.setNext(null);
            }
            return true;
        }
    }

    public void insert(TreeNode person) {
        if (this.isEmpty())
            this.head = new Node(person);               // <- set the head
        else
            this.getLast().setNext(new Node(person));   // <- set the next reference of the last node
    }

    public boolean insert(TreeNode person, int index) {
        if (index == 0) {
            this.head = new Node(person, this.head);
            return true;
        }
        Node prevNode = this.traverseTo(index - 1);
        if (prevNode != null) {
            prevNode.setNext(new Node(person, prevNode.getNext()));
            return true;
        } else              // <- this means that the list is empty
            return false;   //    since the index is not 0, it is invalid
    }

    public TreeNode get(int index) {
        Node node = this.traverseTo(index);
        return node == null ? null : node.getTreeNode();
    }

    public TreeNode get() {
        Node node = this.getLast();
        return node == null ? null : node.getTreeNode();
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
    private Node traverseTo(int index) {
        Node currentNode = index < 0 ? null : this.head;
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
