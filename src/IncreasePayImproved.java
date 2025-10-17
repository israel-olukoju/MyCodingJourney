import java.util.Scanner;

public class IncreasePayImproved {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter score and salary amount
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        System.out.print("Enter monthly salary: ");
        float salaryAmount = input.nextFloat();

        // Increase pay by 3% if score is >= to 90 otherwise increase by 1%
        float increaseSalaryBy3 = salaryAmount * 0.03F;
        float newIncreasedSalaryBy3 = increaseSalaryBy3 + salaryAmount;
        float increaseSalaryBy1 = salaryAmount * 0.01F;
        float newIncreasedSalaryBy1 = increaseSalaryBy1 + salaryAmount;

        if (score >= 90) {
            System.out.println("Congrats, your salary increase by 3%" + "\nYour new salary is $" + newIncreasedSalaryBy3);
        } else {
            System.out.println("Work harder next year" + "\nYour new salary is $" + newIncreasedSalaryBy1);
        }
    }
}
