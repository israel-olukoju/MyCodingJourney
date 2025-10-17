import java.util.Scanner;

public class AlgebraSolveMultiplicationOf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a, b, c, d, e, and f
        System.out.print("a: ");
        float a = input.nextFloat();
        System.out.print("b: ");
        float b = input.nextFloat();
        System.out.print("c: ");
        float c = input.nextFloat();
        System.out.print("d: ");
        float d = input.nextFloat();
        System.out.print("e: ");
        float e = input.nextFloat();
        System.out.print("f: ");
        float f = input.nextFloat();

        // Cramer's rule
        float x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        float y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        System.out.println(((a * d) - (b * c)) == 0 ? "The equation has no solution" : "x is " + x + " and y is " + y);
    }
}
