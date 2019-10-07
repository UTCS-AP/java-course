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

        s = new Student("Mammad", 5);  // <- "new" keyword creates an instance of a class
                            //    now s refers to a real Student

        // Create a Student[] object: an array of references to instances of Student type
        Student[] studentArray = new Student[5];

        // notice that each array element is still null
        studentArray[0] = new Student("Kurt", 25);    // <- now it refers to a new Student instance
        // we can not access the fields of this object anymore, since they are defined "private"
        // studentArray[0].name = "Kurt";                       // <- uncomment to see the error
        studentArray[1] = new Student("Alonzo", 26);
        studentArray[2] = new Student("Stephen", 22);
        studentArray[3] = new Student("Emil", 34);
        studentArray[4] = new Student("Alan", 19);

        // and an array of Courses
        Course[] courseArray = new Course[4];
        courseArray[0] = new Course("Math", "Gauss");
        courseArray[1] = new Course("Programming", "Knuth");
        courseArray[2] = new Course("Physics", "Newton");
        courseArray[3] = new Course("Logic", "Leibniz");

        StudentCourse[] alansCourses = new StudentCourse[4];
        alansCourses[0] = new StudentCourse(courseArray[0], 12);
        alansCourses[1] = new StudentCourse(courseArray[1], 18);
        alansCourses[2] = new StudentCourse(courseArray[2], 11);
        alansCourses[3] = new StudentCourse(courseArray[3], 19);

        studentArray[0].addCourses(alansCourses);

        /* This is a good situation to see a useful syntax
         * of a "for" statement:
         */

        // Now see how a simple job stays simple and intuitive
        for(Student student : studentArray)
            for(StudentCourse studentCourse : student.getStudentCourseArray())
                if(student.getAge() < 12 && studentCourse.getScore() < 12)
                System.out.println("Dear Prof. " + studentCourse.getCourse().getLecturerName() +
                        ", You have a young student called " + student.getName() +
                        " with bad scores in your " + studentCourse.getCourse().getName() + " course.");
        // This is not because it's a simple job, it's because our good "design" of the problem.

        System.out.println("List of students:\n" +
                "NAME\tAGE\n" +
                "------------------------");
        for(Student student : studentArray)                         // <- loop over the array with an "iterator"
            System.out.println(student.getName() + "\t" + student.getAge());  // <- the iterator refers to next element each time

        System.out.println("\nList of courses:\n" +
                "NAME\tLECTURER\n" +
                "------------------------");
        for(Course course : courseArray)
            System.out.println(course.getName() + "\t" + course.getLecturerName()); // <- we also call an object's method
                                                                                    //    by referring it's name with a "."
    }
}
