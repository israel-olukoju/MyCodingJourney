public class Exercise5$13 {
    /** Main method */
    public static void main(String[] args) {
        // While loop
        long sum = 0;
        int i = 0;
        while (i <= 1000) {
            sum += sum + i;
            i++;
            System.out.println(sum);
        }
        // Do-while loop
        do {
            sum += sum + i;
            i++;
            System.out.println(sum);
        } while (i <= 1000);

        // For loop
        for (int j = 0; j < 1000; j++) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
