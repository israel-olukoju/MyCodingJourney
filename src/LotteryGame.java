import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lotteryNumber = (int)(Math.random() * 1000);

        // Prompt user to enter
        System.out.print("Enter three digit: ");
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();
        int guess3 = input.nextInt();

        // Generate three number for our lottery
        int lotteryNumber1 = lotteryNumber / 100;
        int lotteryNumber2 = lotteryNumber / 10 % 10;
        int lotteryNumber3 = lotteryNumber % 10;

        // Lottery number in exact order
        boolean exactOrder = guess1 == lotteryNumber1 && guess2 == lotteryNumber2 && guess3 == lotteryNumber3;
        // Lottery number match the user's digit
        boolean matchDigit = (guess1 == lotteryNumber2 || guess1 == lotteryNumber3) && (guess2 == lotteryNumber1 || guess2 == lotteryNumber3) && (guess3 == lotteryNumber1 || guess3 == lotteryNumber2) ;
        // User matches a digit
        boolean matchADigit = guess1 == lotteryNumber2 || guess1 == lotteryNumber3 || guess2 == lotteryNumber1 || guess2 == lotteryNumber3 || guess3 == lotteryNumber1 || guess3 == lotteryNumber2;

        if (exactOrder) {
            System.out.println("Congratulations, you win $10,000");
        } else if (matchDigit) {
            System.out.println("Congratulations, you win $3,000");
        } else if (matchADigit) {
            System.out.println("Congratulations, you win $1,000");
        }
        else {
            System.out.println("Try again");
        }
    }
}
