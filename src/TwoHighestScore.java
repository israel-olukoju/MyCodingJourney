import java.util.Scanner;

public class TwoHighestScore {
    /** Main method */
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Prompt the user for the number of student
        System.out.print("Enter the number of student: ");
        int numberOfStudent = input.nextInt();

        // First-highest score name
        String studentName1 = "";
        // Second-highest score name
        String studentName2 = "";

        // Number of student starting from 1
        int studentCount = 1;

        // Score for the first-highest and second-highest
        double score1 = Double.NEGATIVE_INFINITY;
        double score2 = Double.NEGATIVE_INFINITY;

        System.out.println("Enter the name of the student and score");
        while (studentCount <= numberOfStudent) {
            System.out.print("Name: ");
            String studentName = input.next();
            System.out.print("Score: ");
            double score = input.nextDouble();
            studentCount++;

            // First highest and Second highest
            if (score > score1) {
                score2 = score1;
                score1 = score;
                studentName2 = studentName1;
                studentName1 = studentName;
            } else if (score > score2) {
                score2 = score;
                studentName2 = studentName;
            }
        }
        // Display
        System.out.printf("Highest score: %s with %.2f%n", studentName1, score1);
        System.out.printf("Second highest score: %s with %.2f%n", studentName2, score2);
    }
}