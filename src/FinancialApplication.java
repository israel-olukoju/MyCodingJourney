import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter subtotal and gratuity rate
        System.out.print("Enter subtotal rate: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter gratuity rate: ");
        double gratuity = input.nextDouble();

        // Gratuity and total rate,
        double gratuityRate = gratuity / 100.0;
        gratuityRate = gratuityRate * subtotal;
        double total = subtotal + gratuityRate;

        // Display
        System.out.println("The gratuity rate is $" + gratuityRate + "and the total is $" + total);
    }
}
