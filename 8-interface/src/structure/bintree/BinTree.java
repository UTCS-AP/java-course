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

    public LinkedList flatten(Tracker tracker) {
        LinkedList list = new LinkedList();
        tracker.add(this.root);
        while (!tracker.isEmpty()) {
            TreeNode currentNode = tracker.remove();
            list.insert(currentNode.getPerson());
            if (currentNode.getRight() != null)
                tracker.add(currentNode.getRight());
            if (currentNode.getLeft() != null)
                tracker.add(currentNode.getLeft());
        }
        return list;
    }
}
