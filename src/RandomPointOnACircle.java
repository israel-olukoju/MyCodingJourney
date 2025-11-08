public class RandomPointOnACircle {
    public static void main(String[] args) {
        // Radius
        final double RADIUS = 40;

        // Random angles between 0 and 2PI
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        // Coordinate of three point in the circle
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);

        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);

        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        // Compute the sides of the triangle formed by this point
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); // Side opposite point 1
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // Side opposite point 2
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // Side opposite point 3

        // Compute the three angle with the law of cosine
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (- 2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (- 2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (- 2 * b * a)));

        // Display
        System.out.println("The three angles are:");
        System.out.printf("A = %4.2f degrees\n", A);
        System.out.printf("B = %4.2f degrees\n", B);
        System.out.printf("C = %4.2f degrees\n", C);
    }
}
