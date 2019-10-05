public class Main {
    public static void main(String[] args) {
        /* We have a simple problem at hand.
         * We want to control a simple data base of students and
         * their scores in some courses. With the tools we have
         * already learned, we can think of many different
         * implementations of this problem. Here, we see a simple
         * one.
         *
         * Students' data have two components: their names and
         * ages. They are stored in arrays, separately.
         */
        String[] studentNames = {   // to nextDev: there's a tie btw these 2 arrs, but u cn't tell ;)
                "Kurt",
                "Alonzo",
                "Stephen",
                "Emil",
                "Alan"
        };
        int[] studentAges = {       // to nextDev: for each i; studentAges[i] and studentNames[i]
                                    //             belong to the same student
                25,
                26,
                22,
                34,
                19
        };
        /* What bounds a single string and a single integer as the
         * name and age of a particular student, is their indices
         * in their respective arrays. But where in the code is
         * this logical relationship specified? Nowhere, exactly.
         * So you, the programmer, must carry this specification
         * of this code somewhere with you, either in the docs, or
         * even your mind.
         *
         * Courses also have two data components, and we also have
         * the same problem here.
         */
        String[] courseName = {
                "Math",
                "Programming",
                "Physics",
                "Logic"
        };
        String[] courseLecturer = {
                "Gauss",
                "Knuth",
                "Newton",
                "Leibniz"
        };
        /* The real mess is where we want to store the relation
         * between a student and a course, i.e. it's score.
         * It should be a 2D matrix, relating student indices in
         * the rows, to course indices in the columns:
         */
        int[][] studentCourseScore = {
                {20, 20, 20, 21},
                {19, 9, 19, 15},
                {13, 20, 14, 15},
                {20, 16, 20, 18},
                {12, 18, 11, 19}
        };

        // Now see how a simple job turns so complex
        for(int s = 0; s < 5; s++)
            if(studentAges[s] < 25)
                for(int c = 0; c < 4; c++)
                    if(studentCourseScore[s][c] <= 15)
                        System.out.println("Dear Prof. " + courseLecturer[c] +
                                            ", You have a young student called " + studentNames[s] +
                                            " with bad scores in your " + courseName[c] + " course.");
        // This is not because it's a complex job, it's because our bad "design" of the problem.

    }
}
