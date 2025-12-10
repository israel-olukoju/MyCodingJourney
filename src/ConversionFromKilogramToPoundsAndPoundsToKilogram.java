public class ConversionFromKilogramToPoundsAndPoundsToKilogram {
    /** Main method*/
    public static void main(String[] args) {
        int kg = 1;
        int lb = 20;

        System.out.println("kilograms     pounds    |     pounds      kilograms");
        while (kg <= 199 && lb <= 515) {
            double pounds = kg * 2.2;
            double kilograms = lb / 2.2;
            System.out.printf("%d          %7.1f      |      %d          %7.2f%n", kg, pounds, lb, kilograms);
            lb += 5;
            kg += 2;

        }
    }
}
