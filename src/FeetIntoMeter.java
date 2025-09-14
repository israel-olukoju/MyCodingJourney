import java.util.Scanner;

public class FeetIntoMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the number of feet
        System.out.print("Enter the number of feet: ");
        double feet = input.nextDouble();
        // Conversion of feet to meter, 1 feet is 0.305 meter
        double feetToMeter = feet * 0.305; // meter is 0.305

        // Display
        System.out.println("The meter of " + feet + " is " + feetToMeter);
    }
}
