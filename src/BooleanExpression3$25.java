import java.util.Scanner;

public class BooleanExpression3$25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter your age
        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        // User must be 14 to 17 years of age
        if (age > 13 && age < 18) {
            System.out.println("True");
        }
        else {
            System.out.println("Get out!!!");
        }
    }
}
