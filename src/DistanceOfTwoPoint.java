import java.util.Scanner;

public class DistanceOfTwoPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter x1, y1 and x2, y2
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Formula for distance of two point
        double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double formula = Math.pow(a, 0.5);

        // Display
        System.out.println("The distance between the two point is " + formula);
    }
}
