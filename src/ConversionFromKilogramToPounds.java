public class ConversionFromKilogramToPounds {
    /** Main method*/
    public static void main(String[] args) {
        // 1 kilogram is 2.2 pounds
        double pound = 2.2;
        System.out.println("Kilogram\tpounds");
        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.printf("%d\t\t\t%.1f%n", i, (i * pound));
        }
    }
}
