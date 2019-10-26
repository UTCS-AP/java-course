package structure.bintree;

import structure.bintree.nll.LinkedList;

public class LinkedQueue {
    private LinkedList list = new LinkedList();

    public void enqueue(TreeNode node) {
        this.list.insert(node);
    }

    public TreeNode dequeue() {
        TreeNode node = this.list.get(0);
        this.list.delete(0);
        return node;
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
