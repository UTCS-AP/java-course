public class Main {
    public static void main(String[] args) {
        final Person[] people = new Person[4];

        people[0] = new Person(
                "Ali",
                "Mamalian",
                "Mammad",
                "Door",
                "ali.mamalian@asf.sa",
                0                           // <- student
        );
        people[1] = new Person(
                "Mammad",
                "Kachalzadeh",
                "Akbar",
                "Hamoonja",
                "mamad.kachal@asf.sa",
                1                           // <- teacher
        );
        people[2] = new Person(
                "Pari",
                "Pardareh",
                "Asghar",
                "Doortar",
                "parpar@asf.sa",
                2                           // <- developer
        );
        people[3] = new Person(
                "Zari",
                "Zardareh",
                "Asghar",
                "Hamoonvara",
                "zz@asf.sa",
                3                           // <- astronaut
        );

        for (Person personIterator : people) {
            String occupation;
            switch (personIterator.getOccupation()) {
                case 0: occupation = "Student"; break;
                case 1: occupation = "Teacher"; break;
                case 2: occupation = "Developer"; break;
                case 3: occupation = "Astronaut"; break;
                case 4: occupation = "Hunter"; break;
                default: occupation = "N/A";
            }
            System.out.println("Name: " + personIterator.getFirstName() +
                    "\tOccupation: " + occupation);
        }
    }
}
