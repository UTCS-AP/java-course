package data;

public class Student extends Person {
    private int studentId;

    public Student(String name, String address, String email, int studentId) {
        super(name, address, email);
        this.studentId = studentId;
    }

    public String toString() {
        return super.toString() +
                "\tStudent id:" + this.studentId;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
