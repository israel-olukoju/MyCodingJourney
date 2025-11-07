import java.util.Scanner;

public class AreaOfAPentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for length
        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        // Formula for computing the area of a pentagon
        double side = 2 * length * Math.sin(Math.PI / 5);
        double Area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        // Display
        System.out.printf("The area of the pentagon is %5.2f", Area);
    }
}
