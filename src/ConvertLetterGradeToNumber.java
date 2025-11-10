import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for grade
        System.out.print("Enter a grade: ");
        String grade = input.nextLine().toUpperCase();

        // Checking the number for grade
        switch (grade) {
            case "A": System.out.printf("The numeric value for %s is 4", grade);
                break;
            case "B": System.out.printf("The numeric value for %s is 3", grade);
                break;
            case "C": System.out.printf("The numeric value for %s is 2", grade);
                break;
            case "D": System.out.printf("The numeric value for %s is 1", grade);
                break;
            case "F": System.out.printf("The numeric value for %s is 0", grade);
                break;
            default: System.out.printf("%s is an invalid grade", grade);
                break;
        }
    }
}
