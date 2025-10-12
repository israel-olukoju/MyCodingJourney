import java.util.Scanner;

public class ComputeThePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a, b, c
        System.out.print("Enter a: ");
        float a = input.nextFloat();
        System.out.print("Enter b: ");
        float b = input.nextFloat();
        System.out.print("Enter c: ");
        float c = input.nextFloat();

        // Perimeter of a triangle
        float perimeter = a + b + c;

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("The perimeter of the triangle is " + perimeter);
        }
        else {
            System.out.println("The input is invalid");
        }
    }
}
