import java.util.Scanner;

public class BooleanExpression3$28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight and height
        System.out.print("Enter your weight: ");
        float weight = input.nextFloat();
        System.out.print("Enter your height: ");
        float height = input.nextFloat();

        // Weight must either be greater than 50 or height be greater than 60
        if (weight > 50 ^ height > 60) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
