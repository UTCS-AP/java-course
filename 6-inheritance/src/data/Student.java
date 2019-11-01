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
        return "Name:" + this.name +
                "\tAddress:" + this.address +
                "\tEmail:" + this.email +
                "\tStudent id:" + this.studentId;
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
