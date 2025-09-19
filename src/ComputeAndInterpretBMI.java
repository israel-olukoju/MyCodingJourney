import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        // Enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Pound in kilogram
        final double KILOGRAM = 0.45359237;
        // Inch in meter
        final double METER = 0.0254;

        // BMI (body mass index)
        double weightInKilogram = weight * KILOGRAM;
        double heightInMeter = height * METER;
        final double BMI = weightInKilogram / Math.pow(heightInMeter, 2);

        // Display
        System.out.println("The BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
