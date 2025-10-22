import java.util.Scanner;

public class PointOnLineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for p0, p1, and p2
        System.out.println("Enter p0, p1, and p2: ");
        float x0 = input.nextFloat();
        float y0 = input.nextFloat();
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();

        // Checking if p2 is on the line segment
        if ((x2 > x0 && x2 < x1) && (y2 > y0 && y2 < y1)) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
        else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }
    }
}
