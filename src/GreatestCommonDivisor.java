import java.util.Scanner;

public class GreatestCommonDivisor {
    /** Main method*/
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Prompt the user for two integers
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // GCD
        int gcd = 1;
        int k = 2;
        while (k <= num1 / 2 && k <= num2 / 2) {
            if (num1 % k == 0 && num2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The gcd is " + gcd);
    }
}