import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a, b , and c
        System.out.print("Enter a: ");
        float a = input.nextFloat();
        System.out.print("Enter b: ");
        float b = input.nextFloat();
        System.out.print("Enter c: ");
        float c = input.nextFloat();

        // Discriminant
        final double DISCRIMINANT = Math.pow(b, 2) - 4 * a * c;

        // ROOTS
        float r1 = (- b + (float) Math.pow(DISCRIMINANT, 0.5)) / 2 * a;
        float r2 = ( b + (float) Math.pow(DISCRIMINANT, 0.5)) / 2 * a;
        float root = (- b + (float) Math.pow(DISCRIMINANT, 0.5)) / 2 * a;
        if (DISCRIMINANT > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (DISCRIMINANT == 0) {
            System.out.println("The equation has one root " + root);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
