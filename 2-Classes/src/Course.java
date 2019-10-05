class Course {
    private String name;
    private String lecturerName;

    public Course(String name, String lecturerName) {
        this.name = name;
        this.lecturerName = lecturerName;
    }

    public String getName() {
        return this.name;
    }

    public String getLecturerName() {
        return this.lecturerName;
    }
}
