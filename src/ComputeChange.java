import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter amount as decimal
        System.out.print("Enter amount in decimal e.g, 10.5, 5.5: ");
        double amount = input.nextDouble();

        // Convert amount into cent
        int remainingAmount = (int) (amount * 100);

        // Number of dollar
        int numberOfOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Number of quarter in the remaining amount
        int numberOfQuarter = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Number of dime in the remaining amount
        int numberOfDime = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Number of nickles in the remaining amount
        int numberOfNickle = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Number of pennies
        int numberOfPennies = remainingAmount;

        // Display
        System.out.println("Your amount of " + amount + " consist of");
        System.out.println("    " + numberOfOneDollar + " dollars");
        System.out.println("    " + numberOfQuarter + " quarters");
        System.out.println("    " + numberOfDime + " dimes");
        System.out.println("    " + numberOfNickle + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");
    }

}
