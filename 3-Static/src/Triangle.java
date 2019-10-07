public class Triangle {
    Vector[] points = new Vector[3];

    public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
        this.points[0] = new Vector(aX, aY);
        this.points[1] = new Vector(bX, bY);
        this.points[2] = new Vector(cX, cY);
    }
}
