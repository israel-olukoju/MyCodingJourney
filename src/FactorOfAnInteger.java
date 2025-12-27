import java.util.Scanner;

public class FactorOfAnInteger {
    /** Main method*/
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int factor = 2;
        System.out.print("The factor for " + number + " is ");
        while (number > 1) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
                number = number / factor;
            }
            else {
                factor++;
            }
        }
    }
}
