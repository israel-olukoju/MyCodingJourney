import java.util.Scanner;

public class UseTheAND$ORAnd$NOROperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter number: ");
        int number = input.nextInt();

        boolean numberDividedBy5And6 = (number % 5 == 0) && (number % 6 == 0);
        boolean numberDividedBy5Or6 = (number % 5 == 0) || (number % 6 == 0);
        boolean numberDividedBy5Nor6 = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + numberDividedBy5And6);
        System.out.println("Is " + number + " divisible by 5 or 6? " + numberDividedBy5Or6);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + numberDividedBy5Nor6);

    }
}
