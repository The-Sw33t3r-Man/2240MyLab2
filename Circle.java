public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // No argument constructor
    public Circle() {
        this.radius = 0;
    }

    // One argument constructor
    public Circle(double rad) {
        if (rad < 0)
            this.radius = 0;
        else
            this.radius = rad;
    }

    // Getter for Radius
    public double getRadius() {
        return this.radius;
    }

    // Setter for Radius
    public void setRadius(double radius) {
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    // GetArea method
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    // Method to compare circles
    public static boolean isBigger(Circle circle1, Circle circle2) {
        return circle1.getRadius() > circle2.getRadius();
    }
}
