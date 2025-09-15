import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the driving distance, miles per gallon, and price per gallon
        System.out.print("Enter the driving distance: ");
        float drivingDistance = input.nextFloat();
        System.out.print("Enter miles per gallon: ");
        float milesPerGallon = input.nextFloat();
        System.out.print("Enter price per gallon: ");
        float pricePerGallon = input.nextFloat();

        // Cost of driving
        float costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;

        // Display
        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
