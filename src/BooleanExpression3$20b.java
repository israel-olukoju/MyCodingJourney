import java.util.Scanner;

public class BooleanExpression3$20b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number greater than or equal to (>=) 9.6
        System.out.print("Enter a number >= 9.6: ");
        double x = input.nextDouble();

        // Expression (|x - 5| > 4.5)
        if (x >= 9.6 && ((x - 5) > 4.5)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
