import java.util.Scanner;

public class EnergyNeededToHeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for amount of water in kilogram, initial temperature, and final temperature
        System.out.print("Enter the amount of water in kilogram: ");
        float weightOfWater = input.nextFloat();
        System.out.print("Enter initial temperature: ");
        float initialTemperature = input.nextFloat();
        System.out.print("Enter final temperature: ");
        float finalTemperature = input.nextFloat();

        // Energy needed to heat water
        float energy = weightOfWater * (finalTemperature - initialTemperature) * 4184;

        // Display
        System.out.println("The amount of energy is " + energy);
    }
}
