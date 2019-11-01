package data;

public class Person {
    private String name, address, email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String toString() {
        return "Name: " + this.name +
                "\tAddress: " + this.address +
                "\tEmail:" + this.email;
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
}
