import java.util.Scanner;

public class AreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the sides of the shape
        System.out.print("Enter the sides: ");
        float side = input.nextFloat();

        // Area of a hexagon
        float a = (float) (3 * Math.pow(3, 0.5)) / 2;
        float area = a * (float) Math.pow(side, 2);

        // Display
        System.out.println("The area of the side is " + area);
    }
}