class StudentCourse {
    private Course course;
    private int score;

    StudentCourse(Course course, int score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() {
        return this.course;
    }

    public int getScore() {
        return this.score;
    }
}
