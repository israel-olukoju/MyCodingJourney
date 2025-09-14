import java.util.Scanner;

public class SumTheDigitInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number between 0 and 1000
        System.out.print("Enter a number between 0 - 1000: ");
        int digit = input.nextInt();

        // Sum of the digit
        int sumOfDigitUnit = digit % 10; // The unit of any digit entered is extracted e.g, 277 the unit is 7
        int sumOfDigitTens = digit / 10;// The tens of any digit entered is extracted e.g, 277 the tens is 7
        sumOfDigitTens = sumOfDigitTens % 10;
        int sumOfDigitHundred = digit / 100; // The hundred of any digit entered is extracted e.g, 277 the hundred is 2
        int sumOfDigit = sumOfDigitHundred + sumOfDigitTens + sumOfDigitUnit; // Sum of the digit, i.e 2+7+7 = 16
        System.out.println("The sum of the digit of " + digit + " is " + sumOfDigit);

    }
}
