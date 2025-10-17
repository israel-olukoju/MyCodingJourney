import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for x and y
        System.out.print("Enter x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        // Display
        System.out.println((x <= 10.0 / 2) && (y <= 5.0 / 2) ? "point (" + x + ", " + y + ") is in the rectangle" : "point (" + x + ", " + y + ") is not in the rectangle");
    }
}
