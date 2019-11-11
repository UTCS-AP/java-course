package structure.bintree;

import data.Person;

public class TreeNode {
    private Person person;
    private TreeNode left, right;


    public TreeNode(Person person) {
        this.person = person;
        this.left = null;
        this.right = null;
    }

    public TreeNode(Person person, TreeNode left, TreeNode right) {
        this.person = person;
        this.left = left;
        this.right = right;
    }

    public Person getPerson() {
        return person;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
