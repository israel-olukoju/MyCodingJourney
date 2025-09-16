import java.util.Scanner;

public class AreaOfACircleUsingIfElseStatement {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a radius
        System.out.print("Enter a radius: ");
        float radius = input.nextFloat();

        // Improved code for area of a circle
        float area = radius * radius * (float) Math.PI;

        if (radius >= 0) {
            System.out.println("The area of the circle of radius " + radius + " is " + area);
        } else {
            System.out.println("Negative input");
        }
    }
}
