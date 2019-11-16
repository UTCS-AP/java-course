package structure.bintree;

import structure.LinkedQueue;
import structure.LinkedStack;
import structure.linkedlist.LinkedList;

/**
 * BinTree is supposed to implement an arbitrary sized binary tree structure of
 * objects.
 *
 * A binary tree is a connected, directed, acyclic graph in which every node has
 * at most one predecessor and two successors. So every (non-empty, finite) binary
 * tree must have one and only one node with no predecessor, called its root, and
 * there are paths from it to every other node in the tree.
 *
 * Nodes of BinTree are objects of type TreeNode, which contain one Object
 * reference and two other TreeNode references, called left and right, pointing to
 * its two successors.
 * A BinTree object would only keep a reference to the root node, accessing all
 * other nodes via root by in two different orders: Depth First Search and Breadth
 * First Search. Both orders start from root. BFS enumerates all nodes in a level
 * before going to the next level. Conversely, DFS enumerates all nodes in a branch
 * before going to the next branch. So if we have a binary tree like this
 *
 *                                    a
 *                                  /  \
 *                                 b    c
 *                                / \  / \
 *                               d  e f  g
 *
 *
 * then its BFS would be (a, b, c, d, e, f, g), and its DFS (a, b, d, e, c, f, g).
 */
public class BinTree {
    /** TreeNode reference to root, null when BinTree is empty */
    private TreeNode root = null;

    /**
     * Checks if the tree is empty.
     * @return false if root is null, true otw.
     */
    public boolean isEmpty() {
        return (this.root == null);
    }

    /**
     * Inserts another node with the given object to the tree, as the last node
     * in the BFS ordering of the tree, i.e. it traverses the tree in BFS, and inserts
     * the new node in the first empty place it encounters.
     * @param o the Object to be added
     */
    public void insert(Object o) {
        if (this.root == null)
            this.root = new TreeNode(o);
        else {
            LinkedQueue queue = new LinkedQueue();
            queue.enqueue(this.root);
            while (true) {
                TreeNode node = (TreeNode) queue.dequeue();
                if (node.getLeft() == null) {
                    node.setLeft(new TreeNode(o));
                    break;
                } else if (node.getRight() == null) {
                    node.setRight(new TreeNode(o));
                    break;
                } else {
                    queue.enqueue(node.getLeft());
                    queue.enqueue(node.getRight());
                }
            }
        }
    }

    /**
     * Flattens the tree into a LinkedList in DFS order.
     * The stack is used to track the path traversed so far, so that we can find
     * the next branch, which begins from a sibling of some previously met node.
     * @return the LinkList object made out of objects in the tree, in DFS order
     */
    public LinkedList flattenDepthFirst() {
        LinkedList list = new LinkedList();
        LinkedStack stack = new LinkedStack();
        stack.push(this.root);
        while (!stack.isEmpty()) {
            TreeNode currentNode = (TreeNode) stack.pop();
            list.insert(currentNode.getObject());
            if (currentNode.getRight() != null)
                stack.push(currentNode.getRight());
            if (currentNode.getLeft() != null)
                stack.push(currentNode.getLeft());
        }
        return list;
    }

    /**
     * Flattens the tree into a LinkedList in BFS order.
     * The queue holds the successors of the current node, so the nodes are traversed
     * in order of their level in the tree, and from left to right in their level.
     * @return the LinkList object made out of objects in the tree, in BFS order
     */
    public LinkedList flattenBreadthFirst() {
        LinkedList list = new LinkedList();
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(this.root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = (TreeNode) queue.dequeue();
            list.insert(currentNode.getObject());
            if (currentNode.getLeft() != null)
                queue.enqueue(currentNode.getLeft());
            if(currentNode.getRight() != null)
                queue.enqueue(currentNode.getRight());
        }
        return list;
    }
}
