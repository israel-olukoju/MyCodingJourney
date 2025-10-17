import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter four points (x1, y1), (x2, y2), (x3, y3), (x4, y4)
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
       float x1 = input.nextFloat();
       float y1 = input.nextFloat();
       float x2 = input.nextFloat();
       float y2 = input.nextFloat();
       float x3 = input.nextFloat();
       float y3 = input.nextFloat();
       float x4 = input.nextFloat();
       float y4 = input.nextFloat();

        // Get a, b, c, d, e, f for cramer's rule
        float a = y1 - y2;
        float b = -(x1 - x2);
        float c = y3 - y4;
        float d = -(x3 - x4);
        float e = (y1 - y2) * x1 - (x1 - x2) * y1;
        float f = (y3 - y4) * x3 - (x3 - x4) * y3;

        float D = (a * d) - (b * c);
        // Cramer's rule
        float x = (e * d - b * f) / D;
        float y = (a * f - e * c) / D;

        // Display
        System.out.println(D == 0 ? "The two lines are parallel" : "The point is (" + x + ", " + y + ")");
    }
}
