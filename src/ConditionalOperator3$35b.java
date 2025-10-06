import java.util.Scanner;

public class ConditionalOperator3$35b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter income
        System.out.print("Enter income: ");
        double income = input.nextDouble();

        if (income > 10000) {
            income *= 0.2;
        }
        else {
            income = income * 0.17 + 1000;
        }
        System.out.println("tax is " + income);
    }
}
