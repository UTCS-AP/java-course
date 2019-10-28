class Occupation {
    String name;

    static final Occupation STUDENT = new Occupation("Student");
    static final Occupation TEACHER = new Occupation("Teacher");
    static final Occupation DEVELOPER = new Occupation("Developer");
    static final Occupation ASTRONAUT = new Occupation("Astronaut");
    static final Occupation HUNTER = new Occupation("Hunter");

    private Occupation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
