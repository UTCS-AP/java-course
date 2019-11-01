package data;

public enum Occupation {

    STUDENT("data.Student"),
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

    public static Occupation typeOf(String name) {
        for (Occupation occupation : Occupation.values())
            if (name.equals(occupation.getName()))
                return occupation;
        return null;
    }
}
