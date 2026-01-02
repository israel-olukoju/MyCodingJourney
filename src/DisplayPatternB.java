public class DisplayPatternB {
    /** Main method*/
    public static void main(String[] args) {
        // Pattern B
        for (int row = 6; row >= 1; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
