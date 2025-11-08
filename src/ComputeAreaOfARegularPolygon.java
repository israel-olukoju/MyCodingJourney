import java.util.Scanner;

public class ComputeAreaOfARegularPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for number of side and the side
        System.out.print("Enter the number of sides: ");
        double numberOfSides = input.nextDouble();
        System.out.print("Enter side: ");
        double sides = input.nextDouble();

        // Area of a regular polygon
        double area = (numberOfSides * Math.pow(sides, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        // Display
        System.out.println("The area of the polygon is " + area);
    }
}
