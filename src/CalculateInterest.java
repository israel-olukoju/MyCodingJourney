import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the balance and interest rate
        System.out.print("Enter balance e.g, 1000: ");
        float balance = input.nextFloat();
        System.out.print("Enter interest rate e.g, 3%: ");
        float annualInterestRate = input.nextFloat();

        // Interest on monthly payment
        float interest = balance * (annualInterestRate / 1200);

        // Display
        System.out.println("The interest is " + interest);
    }
}
