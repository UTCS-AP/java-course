import data.Occupation;
import data.Person;
import data.Staff;
import data.Student;

public class Main {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 0;
        i = b;

        long l;

        l = 0;
        i = (int) l;

        float f;

        f = 3.14f;
        i = (int) f;


        Person jamsheed = new Person("  Jamsheedt   ", "Bonbaste avval", "jami@mail.com");
        Student asghar = new Student("Asqar   ", "Koocheh balayi", "asghi1234@mail.com", 32);
        Staff akbar = new Staff("     Akbar", "Dota kooche balatar", "akbar@mail.com", 32, Occupation.DEVELOPER);

        Person studentAsPerson = asghar;
        Person staffAsPerson = akbar;

        Student studentAgain = (Student) studentAsPerson;
        Staff staffAgain = (Staff) staffAsPerson;

        jamsheed = printNonDevs(jamsheed);

        asghar = (Student) printNonDevs(asghar);

        akbar = (Staff) printNonDevs(akbar);

        System.out.println(jamsheed);
        System.out.println(asghar);
        System.out.println(akbar);
    }

    private static Person printNonDevs(Person person) {
        if (person instanceof Student) {
            Student student = (Student) person;
            return new Student(
                    student.getName().trim(),
                    student.getAddress().trim(),
                    student.getEmail().trim(),
                    student.getStudentId());
        } else if (person instanceof Staff) {
            Staff staff = (Staff) person;
            return new Staff(
                    staff.getName().trim(),
                    staff.getAddress().trim(),
                    staff.getEmail().trim(),
                    staff.getStaffId(),
                    staff.getOccupation()
            );
        } else
            return new Person(person.getName(), person.getAddress(), person.getEmail());
    }
}
