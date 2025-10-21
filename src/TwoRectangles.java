import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter coordinate for the two rectangles
        System.out.print("Enter r1's center x- and y-coordinates, width and height: ");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float w1 = input.nextFloat();
        float h1 = input.nextFloat();
        System.out.print("Enter r2's center x- and y-coordinates, width and height: ");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float w2 = input.nextFloat();
        float h2 = input.nextFloat();

        // Distance
        float xDistance = Math.abs(x1 - x2);
        float yDistance = Math.abs(y1 - y2);

        if (xDistance <= w1 - w2 / 2 && yDistance <= h1 - h2 / 2) {
            System.out.println("r2 is inside r1");
        } else if (xDistance <= w1 + w2 / 2 && yDistance <= h1 + h2 / 2) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlaps r1");
        }
    }
}
