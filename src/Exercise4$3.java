import java.util.Scanner;

public class Exercise4$3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for degree
        System.out.print("Enter degree to convert to radians: ");
        float degree = input.nextInt();

        // Conversion of angle to radians
        float degreeToRadians = (float) Math.toDegrees(degree);

        // Display
        System.out.println("Degree " + degree + " is " + degreeToRadians + " radians");
    }
}
