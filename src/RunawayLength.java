import java.util.Scanner;

public class RunawayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter speed (v) and acceleration (a)
        System.out.print("Enter speed: ");
        float speed = input.nextFloat();
        System.out.print("Enter acceleration: ");
        float acceleration = input.nextFloat();

        // Minimum runaway length
        float length = (float) Math.pow(speed, 2) / (2 * acceleration); // Always separate the mathematical expression with '()' especially when multiplying

        // Display
        System.out.println("The minimum runaway length is " + length);
    }
}
