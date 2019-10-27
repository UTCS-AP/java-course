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

    String getOccupation() {
        String occupation;
        switch (this.occupation) {
            case 0: occupation = "Student"; break;
            case 1: occupation = "Teacher"; break;
            case 2: occupation = "Developer"; break;
            case 3: occupation = "Astronaut"; break;
            case 4: occupation = "Hunter"; break;
            default: occupation = "N/A";
        }
        return occupation;
    }
}
