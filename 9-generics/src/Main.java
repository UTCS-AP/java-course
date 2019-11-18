import data.Person;
import structure.LinkedQueue;
import structure.LinkedStack;
import structure.Queue;
import structure.Stack;
import structure.bintree.BinTree;
import structure.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        final Person ali = new Person("Ali", "Mamalian", "Mammad", "Door", "ali.mamalian@asf.sa");
        final Person mammad = new Person("Mammad", "Kachalzadeh", "Akbar", "Hamoonja", "mamad.kachal@asf.sa");
        final Person pari = new Person("Pari", "Pardareh", "Asghar", "Doortar", "parpar@asf.sa");
        final Person zari = new Person("Zari", "Zardareh", "Asghar", "Hamoonvara", "zz@asf.sa");

        Queue queue = new LinkedQueue();
        queue.enqueue(ali);
        queue.enqueue(mammad);
        queue.enqueue(zari);
        queue.enqueue(pari);

        Person personIterator = (Person) queue.dequeue();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = (Person) queue.dequeue();
        }

        System.out.println("-----------------------");

        Stack stack = new LinkedStack();
        stack.push(pari);
        stack.push(mammad);
        stack.push(zari);
        stack.push(ali);

        personIterator = (Person) stack.pop();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = (Person) stack.pop();
        }

        System.out.println("-----------------------");

        LinkedList linkedList = new LinkedList();

        System.out.println("Inserting " + mammad.getFirstName() + " to the end of the list.");
        linkedList.insert(mammad);
        System.out.println("Inserting " + ali.getFirstName() + " to the end of the list.");
        linkedList.insert(ali);
        System.out.println("Last person is " + ((Person) linkedList.get()).getFirstName());

        System.out.print("Deleting the last person... ");
        System.out.println(
                linkedList.delete() ?
                        "Done." :
                        "Failed!"
        );
        System.out.println("Last person is " + ((Person) linkedList.get()).getFirstName());

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
        personIterator = (Person) linkedList.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = (Person) linkedList.get(++i);
        }

        System.out.println("Traversing backward...");
        personIterator = (Person) linkedList.get();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            linkedList.delete();
            personIterator = (Person) linkedList.get();
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
        personIterator = (Person) flattenDFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = (Person) flattenDFS.get(++i);
        }

        System.out.println("Breadth first travers:");
        LinkedList flattenBFS = tree.flattenBreadthFirst();
        i = 0;
        personIterator = (Person) flattenBFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = (Person) flattenBFS.get(++i);
        }

    }
}
