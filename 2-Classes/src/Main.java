public class Main {
    public static void main(String[] args) {
        /* We have a simple problem at hand.
         * We want to control a simple data base of students and
         * their scores in some courses. Now we now how to create
         * classes with the structure we want. Here we define (in
         * separate files) two classes for students and courses.
         * Check two other files to see how they are
         * defined.
         *
         * The "class" itself, only keeps the "structure". An
         * "instance" (or an "object") of a class, is a named
         * piece of memory allocated according to the structure
         * of the class.
         *
         * Students' data have two components: their names and
         * ages. They are stored in a single class called Student,
         * and here in main function, we keep an array of the
         * Student class. First let experiment with the syntax:
         */
        Student s;          // <- this is a reference, a name, that could refer to an object of type Studednt
                            //    but it is still "empty", i.e. it refers to a general object called "null"

        s = new Student();  // <- "new" keyword creates an instance of a class
                            //    now s refers to a real Student

        // Create a Student[] object: an array of references to instances of Student type
        Student[] studentArray = new Student[5];

        // notice that each array element is still null
        studentArray[0] = new Student();    // <- now it refers to a new Student instance
        // we can access the fields of an object by a "." after its reference
        studentArray[0].name = "Kurt";
        studentArray[0].age = 25;

        studentArray[1] = new Student();
        studentArray[1].name = "Alonzo";
        studentArray[1].age = 26;

        studentArray[2] = new Student();
        studentArray[2].name = "Stephen";
        studentArray[2].age = 22;

        studentArray[3] = new Student();
        studentArray[3].name = "Emil";
        studentArray[3].age = 34;

        studentArray[4] = new Student();
        studentArray[4].name = "Alan";
        studentArray[4].age = 19;

        // and an array of Courses
        Course[] courseArray = new Course[4];

        courseArray[0] = new Course();
        courseArray[0].name = "Math";
        courseArray[0].lecturerName = "Gauss";

        courseArray[1] = new Course();
        courseArray[1].name = "Programming";
        courseArray[1].lecturerName = "Knuth";

        courseArray[2] = new Course();
        courseArray[2].name = "Physics";
        courseArray[2].lecturerName = "Newton";

        courseArray[3] = new Course();
        courseArray[3].name = "Logic";
        courseArray[3].lecturerName = "Leibniz";

        /* This is a good situation to see a useful syntax
         * of a "for" statement:
         */
        System.out.println("List of students:\n" +
                "NAME\tAGE\n" +
                "------------------------");
        for(Student student : studentArray)                         // <- loop over the array with an "iterator"
            System.out.println(student.name + "\t" + student.age);  // <- the iterator refers to next element each time

        System.out.println("\nList of courses:\n" +
                "NAME\tLECTURER\n" +
                "------------------------");
        for(Course course : courseArray)
            System.out.println(course.name + "\t" + course.lecturerName);
    }
}
