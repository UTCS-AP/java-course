/* A class is defined (usually) in a dedicated java file,
 * named exactly as the class name. A basic syntax for
 * defining classes is as follows: "class" keyword, followed
 * by the class name and curly braces, which contain the
 * "class body".
 */

class Student {
    /* We make the structure of the class here, by defining class
     * "members" (or "fields"), just as we used to define variables.
     *
     * "private" is an access modifier, it makes fields "invisible"
     * to the outside, so they are only accessible from within the
     * class.
     */
    private String name;
    private int age;
    private StudentCourse[] studentCourseArray;

    /* A class can also contain "functions" (or "methods").
     * Methods, just like fields, are specific properties
     * of each instance of the class, which could manipulate
     * other properties of that instance, by refering to it
     * with the keyword "this".
     *
     * A good practice, specially when we have private fields
     * is to define a "getter" function, so that other classes
     * that posses an instance of this class have "read" access
     * to these fields.
     */

    String getName() {
        return this.name;   // <- return the "name" field of "this" instance
    }

    int getAge() {
        return this.age;
    }

    public StudentCourse[] getStudentCourseArray() {
        return studentCourseArray;
    }

    /* A "constructor" is a special method that is executes
     * every time a new instance is created with "new" keyword.
     * Constructor is named exactly like the class itself, so
     * when we create an instance of this class by
     * Student s = new Student("someName", 20);
     * we are actually calling this constructor with required
     * parameters.
     *
     * A good practice, specially when we have private fields,
     * is to initialize those fields in the constructor.
     */
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void addCourses(StudentCourse[] studentCourses) {
        this.studentCourseArray = studentCourses;
    }
}
