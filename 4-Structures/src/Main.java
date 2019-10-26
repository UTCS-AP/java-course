import data.Person;
import structure.Queue;
import structure.Stack;
import structure.bintree.BinTree;
import structure.linkedlist.LinkedList;

public class Main {
    static public void main(String[] args) {
        final Person ali = new Person("Ali", "Mamalian", "Mammad", "Door", "ali.mamalian@asf.sa");
        final Person mammad = new Person("Mammad", "Kachalzadeh", "Akbar", "Hamoonja", "mamad.kachal@asf.sa");
        final Person pari = new Person("Pari", "Pardareh", "Asghar", "Doortar", "parpar@asf.sa");
        final Person zari = new Person("Zari", "Zardareh", "Asghar", "Hamoonvara", "zz@asf.sa");


        System.out.println("Creating queue of size 3...");
        Queue queue = new Queue(3);
        if (queue.dequeue() == null)
            System.out.println("Queue is empty.");

        System.out.print("Enqueueing " + ali.getFirstName() + "... ");
        System.out.println(
                queue.enqueue(ali) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Enqueueing " + mammad.getFirstName() + "... ");
        System.out.println(
                queue.enqueue(mammad) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Enqueueing " + zari.getFirstName() + "... ");
        System.out.println(
                queue.enqueue(zari) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Enqueueing " + pari.getFirstName() + "... ");
        System.out.println(
                queue.enqueue(pari) ?
                        "Done." :
                        "Failed!"
        );

        System.out.println("Dequeueing them all...");
        Person personIterator = queue.dequeue();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = queue.dequeue();
        }

        System.out.println("-----------------------");


        System.out.println("Creating stack of size 3...");
        Stack stack = new Stack(3);
        if (stack.pop() == null)
            System.out.println("Stack is empty.");

        System.out.print("Pushing " + pari.getFirstName() + "... ");
        System.out.println(
                stack.push(pari) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Pushing " + mammad.getFirstName() + "... ");
        System.out.println(
                stack.push(mammad) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Pushing " + zari.getFirstName() + "... ");
        System.out.println(
                stack.push(zari) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Pushing " + ali.getFirstName() + "... ");
        System.out.println(
                stack.push(ali) ?
                        "Done." :
                        "Failed!"
        );

        System.out.println("Popping them all...");
        personIterator = stack.pop();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = stack.pop();
        }

        System.out.println("-----------------------");
        System.out.println("Creating an arbitrary sized list.");
        LinkedList linkedList = new LinkedList();
        if (linkedList.isEmpty())
            System.out.println("List is empty.");

        System.out.println("Inserting " + mammad.getFirstName() + " to the end of the list.");
        linkedList.insert(mammad);
        System.out.println("Inserting " + ali.getFirstName() + " to the end of the list.");
        linkedList.insert(ali);
        System.out.println("Last person is " + linkedList.get().getFirstName());

        System.out.print("Deleting the last person... ");
        System.out.println(
                linkedList.delete() ?
                        "Done." :
                        "Failed!"
        );
        System.out.println("Last person is " + linkedList.get().getFirstName());

        System.out.print("Deleting 0... ");
        System.out.println(
                linkedList.delete(0) ?
                        "Done." :
                        "Failed!"
        );

        System.out.println(
                linkedList.get(0) == null ?
                        "List is empty." :
                        "It's still there!"
        );

        System.out.print("Adding " + pari.getFirstName() + " to 0... ");
        System.out.println(
                linkedList.insert(pari, 0) ?
                        "Done." :
                        "Failed!"
                );

        System.out.print("Adding " + zari.getFirstName() + " to 2... ");
        System.out.println(
                linkedList.insert(zari, 2) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Adding " + zari.getFirstName() + " to 1... ");
        System.out.println(
                linkedList.insert(zari, 1) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Adding " + ali.getFirstName() + " to 1... ");
        System.out.println(
                linkedList.insert(ali, 1) ?
                        "Done." :
                        "Failed!"
        );

        System.out.print("Adding " + mammad.getFirstName() + " to 3... ");
        System.out.println(
                linkedList.insert(mammad, 3) ?
                        "Done." :
                        "Failed!"
        );

        System.out.println("Traversing forward...");
        int i = 0;
        personIterator = linkedList.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = linkedList.get(++i);
        }

        System.out.println("Traversing backward...");
        personIterator = linkedList.get();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            linkedList.delete();
            personIterator = linkedList.get();
        }


        System.out.println("-----------------------");

        BinTree tree = new BinTree();
        System.out.println("Adding to the tree...");
        tree.insert(zari);
        tree.insert(mammad);
        tree.insert(pari);
        tree.insert(ali);

        System.out.println("Depth first travers:");
        LinkedList flattenDFS = tree.flattenDepthFirst();
        i = 0;
        personIterator = flattenDFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenDFS.get(++i);
        }

        System.out.println("Breadth first travers:");
        LinkedList flattenBFS = tree.flattenBreadthFirst();
        i = 0;
        personIterator = flattenBFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenBFS.get(++i);
        }
    }
}
