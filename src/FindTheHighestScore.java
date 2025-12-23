import java.util.Scanner;

public class FindTheHighestScore {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of student
        System.out.print("Enter the number of student: ");
        int numberOfStudent = input.nextInt();

        // Empty string to store name of student
        String nameOfStudent = " ";

        // Number of student starting from 1 to the user input
        int studentExceeded = 1;
        // Highest score
        double highestScore = 0;
        while (studentExceeded <= numberOfStudent) {
            // Prompt user for name of each student
            System.out.println("Enter the name of each of the student");
            System.out.print("Student " + studentExceeded + ": ");
            nameOfStudent = input.next();

            System.out.print("Enter the score for student " + studentExceeded + ": ");
            double score = input.nextDouble();
            studentExceeded++;
            // Highest score
            if (score > highestScore) {
                highestScore = score;
            }
        }
        System.out.println(nameOfStudent);
        System.out.println(highestScore);
    }
}
