package data;

public class Person {
    private String name, address, email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String toString() {
        return "Name:\t" + this.name +
                "Address:\t" + this.address +
                "Email:\t" + this.email;
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
