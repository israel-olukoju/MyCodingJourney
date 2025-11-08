import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius of the bounding circle
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // The angle of the radians
        double angle = Math.toRadians(18);

        // Coordinates of five point
        double x1 = radius * Math.cos(angle);
        double y1 = radius * Math.sin(angle);
        double x2 = radius * Math.cos(angle + 2 * Math.PI / 5);
        double y2 = radius * Math.sin(angle + 2 * Math.PI / 5);
        double x3 = radius * Math.cos(angle + 4 * Math.PI / 5);
        double y3 = radius * Math.sin(angle + 4 * Math.PI / 5);
        double x4 = radius * Math.cos(angle + 6 * Math.PI / 5);
        double y4 = radius * Math.sin(angle + 6 * Math.PI / 5);
        double x5 = radius * Math.cos(angle + 8 * Math.PI / 5);
        double y5 = radius * Math.sin(angle + 8 * Math.PI / 5);

        // Display
        System.out.println("The coordinates of five point on the pentagon are");
        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);
    }
}
