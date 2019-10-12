package data;

public class Person {
    private String firstName, lastName, fathersName, address, email;

    public Person(String firstName, String lastName, String fathersName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.address = address;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFathersName() {
        return this.fathersName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }
}
