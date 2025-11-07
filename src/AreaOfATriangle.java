import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points for a triangle
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the lengths of the sides (clockwise arrangement)
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Compute the semi-perimeter (s)
        double s = (side1 + side2 + side3) / 2;

        // Compute the area using Heron’s formula
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Display the result
        System.out.println("The area of the triangle is " + ((int)area * 100) / 100.0);
    }
}
