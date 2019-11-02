import data.Occupation;
import data.Person;
import data.Staff;
import data.Student;
import structures.AbstractFixedQueue;
import structures.CircularQueue;
import structures.ShiftQueue;

public class Main {
    public static void main(String[] args) {
        Person rez = new Person("RZ", "Shahrak", "rz@re.za");
        Person ali = new Staff("Ali", "Too baghcheh", "ali@asd.sad", 12, Occupation.ASTRONAUT);
        Student mohsen = new Student("Mohsen", "Haminja", "m@hs.en", 223);

        int mohsenId = mohsen.getStudentId();
        // int aliId = ali.getStaffId();    // ERROR

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
