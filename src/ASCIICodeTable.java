public class ASCIICodeTable {
    /** Main method*/
    public static void main(String[] args) {
        int count = 1;
        for (int n = 33; n <= 126; n++) {
            System.out.print((char)n + " ");

            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}
