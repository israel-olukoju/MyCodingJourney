import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for hex digit
        System.out.print("Enter a Hex digit: ");
        String hexDigit = input.nextLine();

        // Checking if the length of the hex digit is 1
        if (hexDigit.length() != 1) {
            System.out.println("Enter a digit");
            System.exit(1);
        }
        // To get our character from the string
        char ch = hexDigit.toUpperCase().charAt(0);

        // Conversion of hexadecimal to binary
        int value;
        if (ch <= 'F' && ch >= 'A') {
            value = ch - 'A' + 10;
            System.out.println("The binary value is " + Integer.toBinaryString(value));
        } else if (Character.isDigit(ch)) {
            value = ch;
            System.out.println("The binary value is " + Integer.toBinaryString(value));
        }
        else {
            System.out.printf("%s is an invalid input", hexDigit);
        }
    }
}
