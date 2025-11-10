import java.util.Scanner;

public class ISBN$10String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for ISBN number
        System.out.print("Enter the first 9 digit of the ISBN number: ");
        String isbn = input.nextLine();

        // Getting each of the integer value from ISBN
        int ch1 = isbn.charAt(0) - '0';
        int ch2 = isbn.charAt(1) - '0';
        int ch3 = isbn.charAt(2) - '0';
        int ch4 = isbn.charAt(3) - '0';
        int ch5 = isbn.charAt(4) - '0';
        int ch6 = isbn.charAt(5) - '0';
        int ch7 = isbn.charAt(6) - '0';
        int ch8 = isbn.charAt(7) - '0';
        int ch9 = isbn.charAt(8) - '0';

        // Check-sum for ISBN
        int d10 = (ch1 + ch2 * 2 + ch3 * 3 + ch4 * 4 + ch5 * 5 + ch6 * 6 + ch7 * 7 + ch8 * 8 + ch9 * 9) % 11;

        if (d10 == 10) {
            System.out.printf("The ISBN number is %sX", isbn);
        } else {
            System.out.printf("The ISBN number is %s%d", isbn, d10);
        }
    }
}
