import java.util.Scanner;

public class BooleanExpression3$26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter your weight and height
        System.out.print("Enter your weight: ");
        float weight = input.nextFloat();
        System.out.print("Enter your height: ");
        float height = input.nextFloat();

        // Weight must be greater than 50 or height must be greater than 60
        if (weight > 50 || height > 60) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}
