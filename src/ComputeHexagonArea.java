import java.util.Scanner;

public class ComputeHexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for side
        System.out.print("Enter side: ");
        float s = input.nextFloat();

        // Area of a hexagon
        float area = (float)(6 * Math.pow(s, 2)) / (float)(4 * Math.tan(Math.PI / 6));

        // Display
        System.out.printf("The area of the Hexagon is %5.2f", area);
    }
}
