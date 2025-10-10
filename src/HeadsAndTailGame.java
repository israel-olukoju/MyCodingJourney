import java.util.Scanner;

public class HeadsAndTailGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 2);

        // Enter guess
        System.out.print("Enter guess (1 - head and 0 - tail): ");
        byte guess = input.nextByte();

        // Display
        System.out.println(guess == number ? "Correct guess" :  "Incorrect guess");
    }
}
