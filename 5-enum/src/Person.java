public class Person {
    private String firstName, lastName, fathersName, address, email;

    private Occupation occupation; // THIS SHOULD ONLY TAKE "Occupation" OBJECTS
    Person(String firstName,
                  String lastName,
                  String fathersName,
                  String address,
                  String email,
                  Occupation occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.address = address;
        this.email = email;
        this.occupation = occupation;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getFathersName() {
        return this.fathersName;
    }

    String getAddress() {
        return this.address;
    }

    String getEmail() {
        return this.email;
    }

    Occupation getOccupation() {
        return this.occupation;
    }
}
