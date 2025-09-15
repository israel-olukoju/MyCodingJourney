import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter three point for the triangle which is (x1, y1), (x2, y2), (x3, y3)
        System.out.println("Enter first point:");
        System.out.print("Enter x1: ");
        float x1 = input.nextFloat();
        System.out.print("Enter y1: ");
        float y1 = input.nextFloat();
        System.out.println("Enter second point:");
        System.out.print("Enter x2: ");
        float x2 = input.nextFloat();
        System.out.print("Enter y2: ");
        float y2 = input.nextFloat();
        System.out.println("Enter third point:");
        System.out.print("Enter x3: ");
        float x3 = input.nextFloat();
        System.out.print("Enter y3: ");
        float y3 = input.nextFloat();

        // Area of a triangle
        float side1 = y1 * x1;
        float side2 = y2 * x2;
        float side3 = y3 * x3;
        // Total sides (s)
        float s = (side1 + side2 + side3) / 3;
        // Area
        float area = (float) Math.pow(s * ((s) - side1) * ((s) - side2) * ((s) - side3), 0.5);

        // Display
        System.out.println("The area of the triangle is " + area);
    }
}
