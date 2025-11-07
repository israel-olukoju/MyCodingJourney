public class EstimateAreas {
    public static void main(String[] args) {
        // Step 1: GPS coordinates (in latitude and longitude in degrees)
        double x1 = Math.toRadians(33.7489954); // Atlanta
        double y1 = Math.toRadians(-84.3879824); // Latitude is always in minus(-)
        double x2 = Math.toRadians(28.5383355); // Orlando
        double y2 = Math.toRadians(-81.3792365);
        double x3 = Math.toRadians(32.0835407); // Savannah
        double y3 = Math.toRadians(-81.0998342);
        double x4 = Math.toRadians(35.2270869); // Charlotte
        double y4 = Math.toRadians(-80.8431267);

        // Step 2: Average radius of earth in kilometer
        final double RADIUS = 6371.01;

        // Step 3: Compute distance between cities using the Great circle formula
        double d1 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)); // Atlanta to orlando
        double d2 = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)); // Orlando to savannah
        double d3 = RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)); // Savannah to charlotte
        double d4 = RADIUS * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) * Math.cos(y4 - y1)); // Charlotte to atlanta
        double d5 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3)); // Atlanta to savannah

        // Step 4: Divide into two triangles:
        // (Atlanta, Orlando, Savannah) and (Atlanta, Savannah, Charlotte)
        double s1 = (d1 + d2 + d5) / 2; // Semi-perimeter of first triangle
        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d5));

        double s2 = (d3 + d4 + d5) / 2; // Semi-perimeter of second triangle
        double area2 = Math.sqrt(s1 * (s1 - d3) * (s1 - d4) * (s1 - d5));

        // Step 5: Total area enclosed by the four cities
        double totalArea = area1 + area2;

        // Display
        System.out.printf("The total area enclosed by these four cities is %f Km²", totalArea);

    }
}
