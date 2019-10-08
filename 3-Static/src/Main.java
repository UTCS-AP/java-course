public class Main {
    public static void main(String[] args) {
        // Vector.COUNT = 0
        Vector v1 = new Vector(0, 0);
        // Vector.COUNT = 1
        Vector v2 = new Vector(1, 0);
        // Vector.COUNT = 2
        Vector v3 = new Vector(0, 1);
        // Vector.COUNT = 3

        Triangle t = new Triangle(0, 0, 0, 1, 1, 0); // <- this lines creates three new instances
                                                                           //    of Vector, but it's hidden from here
        // Vector.COUNT = 6
    }
}
