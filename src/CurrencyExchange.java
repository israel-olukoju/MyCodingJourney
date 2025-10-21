import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter exchange rate
        System.out.print("Enter exchange rate from dollars to RMB: ");
        float exchangeRate = input.nextFloat();

        // Ask for conversion option
        System.out.print("Enter 0 to convert dollar to RMB or 1 vice versa: ");
        int option = input.nextInt();

        // Check conversion type
        if (option == 0) {
            System.out.print("Enter dollar amount: ");
            float dollarAmount = input.nextFloat();
            float dollarAmountExchange = dollarAmount * exchangeRate;
            System.out.println("$" + dollarAmount + " is " + dollarAmountExchange + " yuan");
        } else if (option == 1) {
            System.out.print("Enter RMB amount: ");
            float rmbAmount = input.nextFloat();
            float rmbAmountExchange = rmbAmount / exchangeRate;
            System.out.println(rmbAmount + " is $" + rmbAmountExchange);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
