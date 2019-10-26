package structure.bintree;

import data.Person;
import structure.linkedlist.LinkedList;

public class BinTree {
    private TreeNode root = null;

    public boolean isEmpty() {
        return (this.root == null);
    }

    public void insert(Person person) {
        if (this.root == null)
            this.root = new TreeNode(person);
        else {
            LinkedQueue queue = new LinkedQueue();
            queue.enqueue(this.root);
            while (true) {
                TreeNode node = queue.dequeue();
                if (node.getLeft() == null) {
                    node.setLeft(new TreeNode(person));
                    break;
                } else if (node.getRight() == null) {
                    node.setRight(new TreeNode(person));
                    break;
                } else {
                    queue.enqueue(node.getLeft());
                    queue.enqueue(node.getRight());
                }
            }
        }
    }

    public LinkedList flattenDepthFirst() {
        LinkedList list = new LinkedList();
        LinkedStack stack = new LinkedStack();
        stack.push(this.root);
        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            list.insert(currentNode.getPerson());
            if (currentNode.getRight() != null)
                stack.push(currentNode.getRight());
            if (currentNode.getLeft() != null)
                stack.push(currentNode.getLeft());
        }
        return list;
    }

    public LinkedList flattenBreadthFirst() {
        LinkedList list = new LinkedList();
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(this.root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.dequeue();
            list.insert(currentNode.getPerson());
            if (currentNode.getLeft() != null)
                queue.enqueue(currentNode.getLeft());
            if(currentNode.getRight() != null)
                queue.enqueue(currentNode.getRight());
        }
        return list;
    }
}
