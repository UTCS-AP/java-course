package structure.bintree;

import structure.bintree.nll.LinkedList;

public class LinkedStack {
    private LinkedList list = new LinkedList();

    public void push(TreeNode node) {
        this.list.insert(node);
    }

    public TreeNode pop() {
        TreeNode node = this.list.get();
        this.list.delete();
        return node;
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
