import java.util.Scanner;

public class CompareCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight and price for each package
        System.out.println("Enter weight and price for package 1: ");
        float weight1 = input.nextFloat();
        float price1 = input.nextFloat();
        System.out.println("Enter weight and price for package 2: ");
        float weight2 = input.nextFloat();
        float price2 = input.nextFloat();

        // Comparing cost of the two packages
        if (weight2 == weight1 / 2 && price2 == price1 / 2) {
            System.out.println("The packages has the same price");
        } else if (weight2 != weight1 / 2 || price2 != price1 / 2) {
            System.out.println("Package 2 has better price");
        }
        else {
            System.out.println("Package 1 has better price");
        }
    }
}
