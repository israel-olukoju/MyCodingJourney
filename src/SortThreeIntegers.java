import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter three number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Arranging in non-decreasing order
        if (number1 < number2 && number2 < number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 < number3 && number3 < number2) {
            System.out.println(number1 + " " + number3 + " " + number2);
        } else if (number2 < number1 && number1 < number3) {
            System.out.println(number2 + " " + number1 + " " + number3);
        } else if (number2 < number3 && number3 < number1) {
            System.out.println(number2 + " " + number3 + " " + number1);
        } else if (number3 < number1 && number1 < number2) {
            System.out.println(number3 + " " + number1 + " " + number2);
        } else if (number3 < number2 && number2 < number1) {
            System.out.println(number3 + " " + number2 + " " + number1);
        } else if ((number1 == number2) && number2 < number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if ((number1 == number2) && number2 > number3) {
            System.out.println(number3+ " " + number2 + " " + number1);
        } else if ((number1 == number3) && number3 < number2) {
            System.out.println(number1 + " " + number3 + " " + number2);
        } else if ((number1 == number3) && number3 > number2) {
            System.out.println(number2 + " " + number3 + " " + number1);
        } else if (number2 > number1) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if ( number2 < number1) {
            System.out.println(number3 + " " + number2 + " " + number1);
        }
        else {
            System.out.println("This program arranges in non-decreasing order, the number are same");
        }
    }
}
