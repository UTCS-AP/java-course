package structure.bintree;

import structure.bintree.nll.LinkedList;

/**
 * This class implements an arbitrary sized queue of TreeNode objects, used in
 * BFS traverse of a binary tree.
 * In fact this is just a wrapper around an nll.LinkedList object, i.e. a list
 * of TreeNodes, and uses its insert, get and delete methods to simulate the
 * functionality of a queue via enqueue and dequeue methods.
 */
class LinkedQueue {
    /** the actual data nll.LinkedList structure */
    private LinkedList list = new LinkedList();

    /**
     * Adds another TreeNode object at the end of the queue.
     * @param node the TreeNode object to be added
     */
    void enqueue(TreeNode node) {
        // LinkList#insert() just does what we want
        this.list.insert(node);
    }

    /**
     * Removes and gives the TreeNode object at the front of the queue.
     * @return the first TreeNode object in the queue, null if it is empty
     */
    TreeNode dequeue() {
        // Notice that we don't bother about the difficulties we had with
        // the fixed sized queue; The LinkedList handles them.
        TreeNode node = this.list.get(0);
        this.list.delete(0);    // <- Also notice that we don't check if the queue us empty,
                                //    in which case LinkList#delete returns false, and
                                //    LinkList#get() returns null, and we return it as well.
        return node;
    }

    /**
     * Checks if the queue is empty.
     * @return true if list is empty, false otw.
     */
    boolean isEmpty() {
        return this.list.isEmpty();
    }
}
