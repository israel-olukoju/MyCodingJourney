public class DisplayNumberInPyramidPattern {
    /** Main method*/
    public static void main(String[] args) {
        int rows = 8;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            int number = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number *= 2;
            }
            number /= 4;
            for (int l = 1; l < i; l++) {
                System.out.print(number + " ");
                number /= 2;
            }

            System.out.println();
        }
    }
}
