import java.util.Scanner;

public class RepeatAddition {
    /** Main method*/
    public static void main(String[] args) {

        // Scanner class
        Scanner input = new Scanner(System.in);

        // Start time
        long startTime = System.currentTimeMillis() / 1000;

        // Correct count
        int correctCount = 0;

        // Generating 10 question
         for (int i = 1; i <= 10; i++) {
             // Two random number (1 - 15)
             int number1 = (int)(Math.random() * 15) + 1;
             int number2 = (int)(Math.random() * 15) + 1;

             System.out.printf("What is %d + %d? ", number1, number2);
             int answer = input.nextInt();

             if (answer == (number1 + number2)) {
                 correctCount++;
             }
         }
         // End time
        long endTime = System.currentTimeMillis() / 1000;

         // Time spent during the quiz
        long time = endTime - startTime;

        // Display
        System.out.println("You got " + correctCount + " questions correct");
        System.out.println("You answered them in " + time + " seconds");
    }
}
