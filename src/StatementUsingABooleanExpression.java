import java.util.Scanner;

public class StatementUsingABooleanExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer number
        System.out.print("Enter any integer: ");
        int count = input.nextInt();
        boolean number = count % 10 == 0;
        if (number) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}