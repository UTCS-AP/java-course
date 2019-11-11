package structure.bintree.nll;

import structure.bintree.TreeNode;


/**
 * Same as structure.linkedlist.Node, except that instead of a data.Person reference,
 * it holds a structure.bintree.TreeNode reference.
 */
class Node {
    private TreeNode treeNode;

    private Node next;

    Node(TreeNode treeNode) {
        this.treeNode = treeNode;
        this.next = null;
    }

    Node(TreeNode treeNode, Node next) {
        this.treeNode = treeNode;
        this.next = next;
    }

    TreeNode getTreeNode() {
        return this.treeNode;
    }

    Node getNext() {
        return this.next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    boolean isLast() {
        return (this.next == null);
    }
}
