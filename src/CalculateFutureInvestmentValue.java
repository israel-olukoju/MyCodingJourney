import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the investment amount, annual interest rate, and number of years
        System.out.print("Enter the investment amount: ");
        float investmentAmount = input.nextFloat();
        System.out.print("Enter annual interest rate: ");
        float annualInterestRate = input.nextFloat();
        System.out.print("Enter number of years: ");
        float numberOfYears = input.nextFloat();

        // Future investment value
        float futureInvestmentValue = investmentAmount * (float) Math.pow(1 + annualInterestRate / 1200, numberOfYears * 12);

        // Display
        System.out.println("The future investment value is " + futureInvestmentValue);
    }
}
