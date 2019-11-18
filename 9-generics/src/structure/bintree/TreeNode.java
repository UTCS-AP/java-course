package structure.bintree;

/**
 * A TreeNode object is a triple, consists of an Object reference, and two other Node
 * references. So TreeNode objects can gather as a binary tree, such that each one
 * keeps two references to the successor nodes in the tree. A BinTree object can hold
 * and maintain such tree.
 */
public class TreeNode<T> {
    /** Object of this node */
    private T object;

    /** References to the successor nodes in the tree, both null when this is a leaf. */
    private TreeNode<T> left, right;

    /**
     * Creates new TreeNode object, with given Object, left and right references are
     * null until explicitly set by their corresponding setter methods.
     * @param object Object of this node
     */
    public TreeNode(T object) {
        this.object = object;
        this.left = null;
        this.right = null;
    }

    /**
     * Creates new TreeNode object, with given Object and TreeNode objects.
     * @param object Object of this node
     * @param left left successor of this node in the tree
     * @param right right successor of this node in the tree
     */
    public TreeNode(T object, TreeNode<T> left, TreeNode<T> right) {
        this.object = object;
        this.left = left;
        this.right = right;
    }

    public T getObject() {
        return this.object;
    }

    public TreeNode<T> getLeft() {
        return this.left;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}
