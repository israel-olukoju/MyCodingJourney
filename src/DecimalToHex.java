import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a decimal value
        System.out.print("Enter a decimal value (0-15): ");
        int decimalValue = input.nextInt();

        // Checking for the hexadecimal value of the user input
        if (decimalValue <= 9) {
            System.out.printf("The hex value is %d", decimalValue);
        } else if (decimalValue <= 15) {
            int hexadecimalValue = decimalValue - 10 + 'A';
            System.out.printf("The hex value is %c", hexadecimalValue);
        } else {
            System.out.println("Invalid input");
        }
    }
}
