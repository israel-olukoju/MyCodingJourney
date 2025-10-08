import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter amount in decimal
        System.out.print("Enter amount in decimal e.g, 10.5, 6.5: ");
        double amountInDecimal = input.nextDouble();

        // Conversion of the amount into cent
        int remainingAmount = (int) (amountInDecimal * 100);

        // Dollar in the amount
        int dollarInAmount = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Quarter in the amount
        int quarterInAmount = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Dime in the amount
        int dimeInAmount = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Nickle in the amount
        int nickleInAmount = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Penny in the amount
        int pennyInAmount = remainingAmount;

        // Display
        System.out.println("Your amount of " + amountInDecimal + " consist of: ");
        System.out.println(dollarInAmount > 1 ? "$" + dollarInAmount + " dollars" : "$" + dollarInAmount + " dollar");
        System.out.println(quarterInAmount > 1 ? quarterInAmount + " quarters" : quarterInAmount + " quarter");
        System.out.println(dimeInAmount > 1 ? dimeInAmount + " dimes" : dimeInAmount + " dime");
        System.out.println(nickleInAmount == 1 ? nickleInAmount + " nickle" : nickleInAmount + " nickles");
        System.out.println(pennyInAmount > 1 ? pennyInAmount + " pennies" : pennyInAmount + " penny");
    }
}
