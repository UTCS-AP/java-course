package structure.bintree;

import data.Person;

/**
 * A TreeNode object is a triple, consists of a Person reference, and two other Node
 * references. So TreeNode objects can gather as a binary tree, such that each one
 * keeps two references to the successor nodes in the tree. A BinTree object can hold
 * and maintain such tree.
 */
public class TreeNode {
    /** Persons object of this node */
    private Person person;

    /** References to the successor nodes in the tree, both null when this is a leaf. */
    private TreeNode left, right;

    /**
     * Creates new TreeNode object, with given Person, left and right references are
     * null until explicitly set by their corresponding setter methods.
     * @param person Person instance of this node
     */
    TreeNode(Person person) {
        this.person = person;
        this.left = null;
        this.right = null;
    }

    /**
     * Creates new TreeNode object, with given Person and TreeNode objects.
     * @param person Person instance of this node
     * @param left left successor of this node in the tree
     * @param right right successor of this node in the tree
     */
    public TreeNode(Person person, TreeNode left, TreeNode right) {
        this.person = person;
        this.left = left;
        this.right = right;
    }

    public Person getPerson() {
        return this.person;
    }

    TreeNode getLeft() {
        return this.left;
    }

    TreeNode getRight() {
        return this.right;
    }

    void setLeft(TreeNode left) {
        this.left = left;
    }

    void setRight(TreeNode right) {
        this.right = right;
    }
}
