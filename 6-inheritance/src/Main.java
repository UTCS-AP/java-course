import data.Occupation;
import data.Person;
import data.Staff;
import data.Student;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person rez = new Person("RZ", "Shahrak", "rz@re.za");
        Person ali = new Staff("Ali", "Too baghcheh", "ali@asd.sad", 12, Occupation.ASTRONAUT);
        Student mohsen = new Student("Mohsen", "Haminja", "m@hs.en", 223);

        int mohsenId = mohsen.getStudentId();
        // int aliId = ali.getStaffId();    // ERROR

        System.out.println(rez.toString());
        System.out.println(ali.toString());
        System.out.println(mohsen.toString());
    }
}
