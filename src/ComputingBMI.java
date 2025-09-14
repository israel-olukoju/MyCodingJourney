import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter weight in pounds and height in inches
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = input.nextFloat();

        // Conversion of weight to kilogram and height to meter
        float weightToKilogram = weight * 0.45359237F; // Weight converted to kilogram
        float heightToMeters = height * 0.0254F;

        // BMI (body mass index)
        float bodyMassIndex = weightToKilogram / (float) Math.pow(heightToMeters, 2);

        // Display
        System.out.println("The BMI(body mass index) is " + bodyMassIndex);


    }
}
