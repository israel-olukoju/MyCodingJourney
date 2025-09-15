import java.util.Scanner;

public class IfScoreIsGreaterThan90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter your score and monthly salary
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        System.out.println("Enter your monthly salary amount: ");
        double salary = input.nextDouble();
        // 3% increase of salary if the score is greater than 90
        double salaryIncrease = salary * 0.03;
        if (score >= 90) {
            System.out.println("Salary increase from " + salary + " to " + (salary + salaryIncrease));
        }
    }
}
