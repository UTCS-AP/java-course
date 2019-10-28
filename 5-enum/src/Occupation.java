enum Occupation {

    STUDENT("Student"),
    TEACHER("Teacher"),
    DEVELOPER("Developer"),
    ASTRONAUT("Astronaut"),
    HUNTER("Hunter");

    String name;

    Occupation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
