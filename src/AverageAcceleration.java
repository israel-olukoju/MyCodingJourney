import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter v0: velocity not
        System.out.print("Enter v0: ");
        float v0 = input.nextFloat();
        // Enter v1: velocity one
        System.out.print("Enter v1: ");
        float v1 = input.nextFloat();
        // Enter t: time
        System.out.print("Enter t: ");
        float t = input.nextFloat();

        // Average acceleration
        float averageAcceleration = (v1 - v0) / t;

        // Display
        System.out.println("The average acceleration is " + averageAcceleration);
    }
}
