import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter coordinate for the two rectangles
        System.out.print("Enter r1's center x- and y-coordinates, width and height: ");
        float widthXR1 = input.nextFloat();
        float widthYR1 = input.nextFloat();
        float heightXR1 = input.nextFloat();
        float heightYR1 = input.nextFloat();
        System.out.print("Enter r2's center x- and y-coordinates, width and height: ");
        float widthXR2 = input.nextFloat();
        float widthYR2 = input.nextFloat();
        float heightXR2 = input.nextFloat();
        float heightYR2 = input.nextFloat();

        if ((widthXR1 + widthYR1 >= widthXR2 + widthYR2) && (heightXR1 + heightYR1 >= heightXR2 + heightYR2)) {
            System.out.println("r2 is inside r1");
        } else if ((widthXR1 + widthYR1 <= widthXR2 + widthYR2) && (heightXR1 + heightYR1 <= heightXR2 + heightYR2)) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlaps r1");
        }
    }
}
