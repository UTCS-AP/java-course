package structure.bintree;

import structure.bintree.nll.LinkedList;

/**
 * This class implements an arbitrary sized stack of TreeNode objects, used in
 * DFS traverse of a binary tree.
 * In fact this is just a wrapper around an nll.LinkedList object, i.e. a list
 * of TreeNodes, and uses its insert, get and delete methods to simulate the
 * functionality of a stack via push and pop methods.
 */
class LinkedStack {
    /** the actual data nll.LinkedList structure */
    private LinkedList list = new LinkedList();

    /**
     * Adds another TreeNode object at the end of the stack.
     * @param node the TreeNode object to be added
     */
    void push(TreeNode node) {
        this.list.insert(node);
    }

    /**
     * Removes and gives the TreeNode object at the end of the stack.
     * @return the last TreeNode object in the stack, null if it is empty
     */
    TreeNode pop() {
        TreeNode node = this.list.get();
        this.list.delete();
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
