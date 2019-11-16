package structure.bintree;

/**
 * A TreeNode object is a triple, consists of an Object reference, and two other Node
 * references. So TreeNode objects can gather as a binary tree, such that each one
 * keeps two references to the successor nodes in the tree. A BinTree object can hold
 * and maintain such tree.
 */
public class TreeNode {
    /** Object of this node */
    private Object object;

    /** References to the successor nodes in the tree, both null when this is a leaf. */
    private TreeNode left, right;

    /**
     * Creates new TreeNode object, with given Object, left and right references are
     * null until explicitly set by their corresponding setter methods.
     * @param object Object of this node
     */
    public TreeNode(Object object) {
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
    public TreeNode(Object object, TreeNode left, TreeNode right) {
        this.object = object;
        this.left = left;
        this.right = right;
    }

    public Object getObject() {
        return this.object;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
