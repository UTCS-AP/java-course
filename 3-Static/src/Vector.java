public class Vector {
    private static int COUNT;

    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;

        Vector.COUNT++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double length() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static int getCOUNT() {
        return COUNT;
    }
}
