public class DisplayPatternA {
    /** Main method*/
    public static void main(String[] args) {
        // Pattern A
        for (int row = 1; row <= 6; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
