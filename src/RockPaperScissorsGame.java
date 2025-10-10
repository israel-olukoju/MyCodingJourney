import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte number = (byte)(Math.random() * 3);

        // Prompt player to pick
        System.out.print("Scissors(0), rock(1), paper(2): ");
        byte guess = input.nextByte();

        if (number == guess) {
            switch (number) {
                case 0: System.out.println("The computer is scissors, you are scissors. It's a draw");
                    break;
                case 1: System.out.println("The computer is rock, you are rock. It's a draw");
                    break;
                case 2: System.out.println("The computer is paper, you are paper. It's a draw");
                    break;
            }
        } else if (number == 0 && guess == 2) {
            System.out.println("The computer is scissors, you are paper. You lost");
        } else if (number == 2 && guess == 0) {
            System.out.println("The computer is paper, you are scissors. You won");
        } else if (number == 2 && guess == 1) {
            System.out.println("The computer is paper, you picked rock. You lost");
        } else if (number == 1 && guess == 2) {
            System.out.println("The computer is rock, you picked paper. You won");
        } else if (number == 1 && guess == 0) {
            System.out.println("The computer is rock, you picked scissors. You lost");
        } else if (number == 0 && guess == 1) {
            System.out.println("The computer is scissors, you picked rock. You won");
        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}
