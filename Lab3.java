import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inpRadius;

        // Create circle objects
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(10);

        // Print out the area of the circles
        System.out.printf("Circle 1 has radius %.1f and area %.2f%n", cir1.getRadius(), cir1.getArea());
        System.out.printf("Circle 2 has radius %.1f and area %.2f%n", cir2.getRadius(), cir2.getArea());

        // Prompt the user for a radius
        do {
            System.out.print("Enter a positive radius => ");
            inpRadius = scanner.nextDouble();
        } while (inpRadius < 0);
        cir1.setRadius(inpRadius);

        // Print out the area of the circles
        System.out.printf("Circle 1 has radius %.1f and area %.2f%n", cir1.getRadius(), cir1.getArea());
        System.out.printf("Circle 2 has radius %.1f and area %.2f%n", cir2.getRadius(), cir2.getArea());

        // Add circles
        if (Circle.isBigger(cir1, cir2))
            System.out.printf("Circle 1, with radius %.1f is bigger than Circle 2 with radius %.1f%n", cir1.getRadius(), cir2.getRadius());
        else
            System.out.printf("Circle 1, with radius %.1f is not bigger than Circle 2 with radius %.1f%n", cir1.getRadius(), cir2.getRadius());

        scanner.close();
    }
}
