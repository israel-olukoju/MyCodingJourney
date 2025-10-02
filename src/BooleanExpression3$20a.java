import java.util.Scanner;

public class BooleanExpression3$20a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number less than or equal to (<=) 9.4
        System.out.print("Enter a number <= 9.4: ");
        double x = input.nextDouble();

        // Expression (|x - 5| < 4.5)
        if ((x <= 9.4) && ((x - 5) < 4.5)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
