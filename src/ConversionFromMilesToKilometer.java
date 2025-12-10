public class ConversionFromMilesToKilometer {
    /** Main method*/
    public static void main (String[] args) {
        // i mile is 1.609 kilometers
        double kilometer = 1.609;
        System.out.println("miles\tkilometer");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t\t\t%.3f%n", i , (i * kilometer));
        }
    }
}
