public class Main {
    public static void main(String[] args) {
        final Person[] people = new Person[4];

        people[0] = new Person(
                "Ali",
                "Mamalian",
                "Mammad",
                "Door",
                "ali.mamalian@asf.sa",
                Occupation.STUDENT
        );
        people[1] = new Person(
                "Mammad",
                "Kachalzadeh",
                "Akbar",
                "Hamoonja",
                "mamad.kachal@asf.sa",
                Occupation.TEACHER
        );
        people[2] = new Person(
                "Pari",
                "Pardareh",
                "Asghar",
                "Doortar",
                "parpar@asf.sa",
                Occupation.DEVELOPER
        );
        people[3] = new Person(
                "Zari",
                "Zardareh",
                "Asghar",
                "Hamoonvara",
                "zz@asf.sa",
                Occupation.ASTRONAUT
        );

        for (Person personIterator : people) {
            System.out.print("Name: " + personIterator.getFirstName() + "\tOccupation: ");
            switch (personIterator.getOccupation()) {
                case STUDENT:
                    System.out.println("Student");
                    break;
                case TEACHER:
                    System.out.println("Teacher");
                    break;
                case DEVELOPER:
                    System.out.println("Developer");
                    break;
                case ASTRONAUT:
                    System.out.println("Astronaut");
                    break;
                case HUNTER:
                    System.out.println("Hunter");
                    break;
            }
        }
    }
}
