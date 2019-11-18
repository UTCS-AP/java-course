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

        Queue<Person> queue = new LinkedQueue<Person>();
        queue.enqueue(ali);
        queue.enqueue(mammad);
        queue.enqueue(zari);
        queue.enqueue(pari);

        Person personIterator = queue.dequeue();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = queue.dequeue();
        }

        System.out.println("-----------------------");

        Stack<Person> stack = new LinkedStack<Person>();
        stack.push(pari);
        stack.push(mammad);
        stack.push(zari);
        stack.push(ali);

        personIterator = stack.pop();
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = stack.pop();
        }

        System.out.println("-----------------------");

        LinkedList<Person> linkedList = new LinkedList<Person>();

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

        BinTree<Person> tree = new BinTree<Person>();
        System.out.println("Adding to the tree...");
        tree.insert(zari);
        tree.insert(mammad);
        tree.insert(pari);
        tree.insert(ali);

        System.out.println("Depth first travers:");
        LinkedList<Person> flattenDFS = tree.flattenDepthFirst();
        i = 0;
        personIterator = flattenDFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenDFS.get(++i);
        }

        System.out.println("Breadth first travers:");
        LinkedList<Person> flattenBFS = tree.flattenBreadthFirst();
        i = 0;
        personIterator = flattenBFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenBFS.get(++i);
        }

    }
}
