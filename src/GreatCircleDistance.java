import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for longitude and latitude in degrees
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String point1 = input.nextLine();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String point2 = input.nextLine();

        // Extracting latitude and longitude for point 1
        int k = point1.indexOf(' ');
        double degreesX1 = Double.parseDouble(point1.substring(0, k - 1));
        double degreesY1 = Double.parseDouble(point1.substring(k + 1));
        // Extracting latitude and longitude for point 1
        k = point1.indexOf(' ');
        double degreesX2 = Double.parseDouble(point2.substring(0, k - 1));
        double degreesY2 = Double.parseDouble(point2.substring(k + 1));


        // Convert degree to radians
        double radiansX1 = Math.toRadians(degreesX1);
        double radiansY1 = Math.toRadians(degreesY1);
        double radiansX2 = Math.toRadians(degreesX2);
        double radiansY2 = Math.toRadians(degreesY2);
        // Average earth radius(km)
        final double AER = 6371.01;

        // Great circle distance
        double distance = AER * Math.acos(Math.sin(radiansX1) * Math.sin(radiansX2) + Math.cos(radiansX1) * Math.cos(radiansX2) * Math.cos(radiansY1 - radiansY2));

        // Display
        System.out.printf("The distance between the two point is %f Km", distance);
    }
}
