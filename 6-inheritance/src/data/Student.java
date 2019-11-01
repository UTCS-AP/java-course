package data;

public class Student {
    private String name, address, email;
    private int studentId;

    public Student(String name, String address, String email, int studentId) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.studentId = studentId;
    }

    public String toString() {
        return "Name:\t" + this.name +
                "Address:\t" + this.address +
                "Email:\t" + this.email +
                "Student id:\t" + this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
