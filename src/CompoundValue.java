import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the monthly savings amount
        System.out.print("Enter the monthly savings amount: ");
        float savingsAmount = input.nextFloat();

        // Monthly interest
        float interest = (float) (1 + 0.00417);
        float firstMonth = (savingsAmount * interest);
        float secondMonth = (savingsAmount + firstMonth) * (interest);
        float thirdMonth = (savingsAmount + secondMonth) * (interest);
        float forthMonth = (savingsAmount + thirdMonth) * (interest);
        float fifthMonth = (savingsAmount + forthMonth) * (interest);
        float sixthMonth = (savingsAmount + fifthMonth) * (interest);

        // Display
        System.out.println("After the six month, the account value for " + savingsAmount + " is " + sixthMonth);
    }
}
