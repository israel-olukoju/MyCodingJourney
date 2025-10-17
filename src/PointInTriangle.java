import java.util.Scanner;

public class PointInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for x- and y-coordinate
        System.out.print("Enter x- and y-coordinate: ");
        float x = input.nextFloat();
        float y = input.nextFloat();

        // Slope y = mx + c
        float slope = - 0.5F * x + 100;

        // Display
        System.out.println(x >= 0 && y >= 0 && y <= slope ? "The point is in the triangle" : "The point is not in the triangle");
    }
}