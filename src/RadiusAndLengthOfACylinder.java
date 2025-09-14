import java.util.Scanner;

public class RadiusAndLengthOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the radius and length of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        // The area and volume of a cylinder
        double area = radius * radius * 3.14159; // Math.PI is giving the full mathematical expression so, i used  3.14159
        double volume = area * length;

        // Display
        System.out.println("The area of the cylinder is " + area + " and the volume is " + volume);
    }
}
