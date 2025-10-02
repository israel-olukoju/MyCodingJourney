import java.util.Scanner;

public class BooleanExpression3$19b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number between 1 and 100 it can be -1 or - 100
        System.out.print("Enter a number between 1 and 100 it can be -1 or -100: ");
        int number = input.nextInt();

        if ((number >= 1 && number <= 100) || (number < 0)) {
            System.out.println("True");
        }
        else {
            System.out.println("Wrong input");
        }
    }
}
