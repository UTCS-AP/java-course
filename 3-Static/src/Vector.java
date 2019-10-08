public class Vector {
    /* This line creates only one COUNT variable,
     * even if no instance of this class is created,
     * or if there are many of them.
     *
     * Accessed via class name
     */
    private static int COUNT;

    // Each instance of this class has its own x and y variables.
    // Access via object name
    private double x;
    private double y;

    // Each instance of this class has its own methods.
    // Access via object name
    public Vector(double x, double y) {
        // Notice that "this" keyword refers the the object that "owns" this method.
        // "this.x" and "this.y" are different variables for every object
        this.x = x;
        this.y = y;

        // but COUNT is a single variable, shared by all objects of this class
        Vector.COUNT++;
    }

    public double getX() {
        /* for example if this method is called by
         *      v1.getX();
         * then "this" keyword below would refer to instance "v1" of class "Vector"
         * and it would return "v1.x".
         */
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }


    // Like static variables, static methods does not belong to any particular instance
    // Access via class name
    public static int getCOUNT() {
        /* The class itself owns this method, not instances.
         * So you can call it by "Vector.getCOUNT();", even
         * if you have no Vector instances. So it's absurd to
         * use "this" here.
         */
        return Vector.COUNT;
    }
}
