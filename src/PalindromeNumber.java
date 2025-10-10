import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter three digit
        System.out.print("Enter three-digit number: ");
        int threeDigit = input.nextInt();

        // Extract first and last digit for palindrome
        int firstDigit = threeDigit / 100;
        int lastDigit = threeDigit % 10;

        // Display
        System.out.println(firstDigit == lastDigit ? threeDigit + " is a palindrome" : threeDigit + " is not a palindrome");
    }
}
