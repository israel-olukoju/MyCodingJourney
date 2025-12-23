public class NumbersDivisibleBy5And6 {
    /** Main method*/
    public static void main(String[] args) {
        int count = 0;
        for (int j = 100; j <= 1000; j++) {
            if (j % 5 == 0 && j % 6 == 0) {
                System.out.print(j + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }
}
