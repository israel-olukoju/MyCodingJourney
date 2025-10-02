import java.util.Scanner;

public class OperatorExample {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();
        // Is working like OR operator, !AND is OR
        if (!(number % 2 == 0 && number % 3 == 0)) {
            System.out.println(number + " is not divisible by 2 or 3.");
        }
        // Is working like AND operator, !OR is AND
        if (!(number % 2 != 0 || number % 3 != 0)) {
            System.out.println(number + " is divisible by 2 and 3.");
        }
    }
}
