import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for x and y
        System.out.print("Enter x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        // Formula to get the point in the circle
        double pointInACircle = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);

        // Display
        System.out.println(pointInACircle <= 10 ? "The point (" + x + ", " + y + ") is in the circle" : "The point (" + x + ", " + y + ") is not in the circle");
        System.out.println(pointInACircle);
    }
}
