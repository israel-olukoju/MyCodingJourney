import java.util.Scanner;

public class GameAddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10 - 1);
        int number2 = (int)(Math.random() * 10 - 1);
        int number3 = (int)(Math.random() * 10 - 1);

        // Prompt the user to enter the sum of 3 numbers
        System.out.print("What is the sum of " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();
        System.out.println(answer == number1 + number2 + number3 ? "correct" : "wrong");
    }
}
