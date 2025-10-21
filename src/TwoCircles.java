import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for coordinate of the two circles and the radius
        System.out.print("Enter circle1's center x-, y-coordinate and radius: ");
        float centerXCircle1 = input.nextFloat();
        float centerYCircle1 = input.nextFloat();
        float radiusCircle1 = input.nextFloat();
        System.out.print("Enter circle2's center x-, y-coordinate and radius: ");
        float centerXCircle2 = input.nextFloat();
        float centerYCircle2 = input.nextFloat();
        float radiusCircle2 = input.nextFloat();

        // Distance between the two point
        float distance = (float)Math.pow(Math.pow(centerXCircle2 - centerXCircle1, 2) + Math.pow(centerYCircle2 - centerYCircle1, 2), 0.5);

        if (distance <= (radiusCircle1 - radiusCircle2)) {
            System.out.println("circle2 is inside circle 1");
        } else if (distance <= (radiusCircle1 + radiusCircle2)) {
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
