import data.Person;
import structures.AbstractFixedQueue;
import structures.CircularQueue;
import structures.ShiftQueue;

public class Main {
    public static void main(String[] args) {
        Person rez = new Person("RZ", "Shahrak", "rz@re.za");
        Person ali = new Person("Ali", "Too baghcheh", "ali@asd.sad");
        Person mohsen = new Person("Mohsen", "Haminja", "m@hs.en");

        AbstractFixedQueue queue = new CircularQueue(2);
        // AbstractFixedQueue queue = new ShiftQueue(2);

        System.out.println(
                queue.enqueue(ali) ?
                        "Added " + ali.getName() :
                        "Error!"
                );
        System.out.println(
                queue.enqueue(mohsen) ?
                        "Added " + mohsen.getName() :
                        "Error!"
        );
        System.out.println(
                queue.enqueue(rez) ?
                        "Added " + rez.getName() :
                        "Error!"
        );

        System.out.println("Reading from queue...");
        Person personIterator;
        while ((personIterator = queue.dequeue()) != null)
            System.out.println(personIterator.toString());
    }
}
