import java.util.Scanner;

public class ComputeNegativeAndPositiveAndComputeTheAverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for integer
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        // Checking the negative and positive numbers and the average of the number
        int countPositive = 0;
        int countNegative = 0;
        int count = 0;
        double sum = 0;

        // exit the code if the number is 0
        if (number == 0) {
            System.out.println("No number was entered except 0 or the first number is 0");
            System.exit(1);
        }

        while (number != 0) {

            if (number > 0) {
                countPositive++;
            }
            else {
                countNegative++;
            }

            sum += number;
            count++;
            number = input.nextInt();
        }
        System.out.println("The number of positive is " + countPositive);
        System.out.println("The number of negative is " + countNegative);
        System.out.println("The total is " + (float)sum);
        System.out.println("The average is " + sum / count);
    }
}
