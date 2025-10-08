import java.util.Scanner;

public class HealthApplicationBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter weight in pounds, feet and inches
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        // Conversion of feet to inches
        double feetToInches = feet + inches * 0.01;

        // Conversion of inches to height
        double inchesToHeight = feetToInches * 12; // one foot makes 12 inches

        // Conversion of height to meter and weight to kilogram
        double heightToMeter = inchesToHeight * 0.0254;
        double weightToKilogram = weight * 0.45359237;

        // BMI (body mass index)
        double bodyMassIndex = weightToKilogram / Math.pow(heightToMeter, 2);

        // Display
        System.out.println("The body mass index is " + bodyMassIndex);
        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex < 25.0) {
            System.out.println("Normal");
        } else if (bodyMassIndex < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
