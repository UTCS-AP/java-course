import data.Person;
import structure.bintree.BinTree;
import structure.bintree.LinkedQueue;
import structure.bintree.LinkedStack;
import structure.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        final Person ali = new Person("Ali", "Mamalian", "Mammad", "Door", "ali.mamalian@asf.sa");
        final Person mammad = new Person("Mammad", "Kachalzadeh", "Akbar", "Hamoonja", "mamad.kachal@asf.sa");
        final Person pari = new Person("Pari", "Pardareh", "Asghar", "Doortar", "parpar@asf.sa");
        final Person zari = new Person("Zari", "Zardareh", "Asghar", "Hamoonvara", "zz@asf.sa");

        BinTree tree = new BinTree();

        tree.insert(zari);
        tree.insert(mammad);
        tree.insert(pari);
        tree.insert(ali);

        System.out.println("Depth first travers:");
        LinkedList flattenDFS = tree.flatten(new LinkedStack());
        int i = 0;
        Person personIterator = flattenDFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenDFS.get(++i);
        }

        System.out.println("Breadth first travers:");
        LinkedList flattenBFS = tree.flatten(new LinkedQueue());
        i = 0;
        personIterator = flattenBFS.get(0);
        while (personIterator != null) {
            System.out.println("\t" + personIterator.getFirstName());
            personIterator = flattenBFS.get(++i);
        }

        new Thread(new WaitAndPrint(0, 4)).start();
        new Thread(new WaitAndPrint(1, 3)).start();
        new Thread(new WaitAndPrint(2, 2)).start();
        new Thread(new WaitAndPrint(3, 1)).start();
    }
}
