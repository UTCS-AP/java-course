public class Person {
    private String firstName, lastName, fathersName, address, email;

    private int occupation; // 0 = student
                            // 1 = teacher
                            // 2 = developer
                            // 3 = astronaut
                            // 4 = hunter

    Person(String firstName,
                  String lastName,
                  String fathersName,
                  String address,
                  String email,
                  int occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.address = address;
        this.email = email;

        if (0 <= occupation && occupation <= 5) // <- checks if a valid occupation code is given
            this.occupation = occupation;
        else
            this.occupation = 0;                // <- default is student
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

    int getOccupation() {
        return this.occupation;
    }
}
