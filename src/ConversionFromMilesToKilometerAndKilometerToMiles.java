public class ConversionFromMilesToKilometerAndKilometerToMiles {
    public static void main(String[] args) {
        System.out.println("Miles  Kilometer  |  Kilometer  Miles");
        int mile = 1;
        int kilometer = 20;

        while (mile <= 10 && kilometer <= 65) {
            double kilometers = 1.609 * mile;
            double miles = kilometer / kilometers;
            System.out.printf("%d     %7.3f     |  %d        %7.3f%n", mile, kilometers, kilometer, miles);
            mile++;
            kilometer += 5;
        }
    }
}
