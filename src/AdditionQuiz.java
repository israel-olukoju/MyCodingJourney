import java.util.Scanner;

public class AdditionQuiz {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        byte number1 = (byte)(Math.random() * 100);
        byte number2 = (byte)(Math.random() * 100);

        // Prompt user for an answer
        System.out.print("What is " + number1 + " + " +  number2 + "? ");
        byte answer = input.nextByte();

        // Correct answer
        byte correctAnswer = (byte)(number1 + number2);

        // Display
        System.out.println(number1 + number2 == answer ? "That's correct" : "Wrong " + number1 + " + " + number2 + " is " + correctAnswer);
    }
}
