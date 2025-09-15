public class PrintATable1 {
    public static void main(String[] args) {
        // Math.pow(a, b)
       double row1 = Math.pow(1, 2);
       double row2 = Math.pow(2, 3);
       double row3 = Math.pow(3, 4);
       double row4 = Math.pow(4, 5);
       double row5 = Math.pow(5, 6);

       // Display
        System.out.println("a      b      pow(a, b)");
        System.out.println("1      2      " + (int)row1);
        System.out.println("2      3      " + (int)row2);
        System.out.println("3      4      " + (int)row3);
        System.out.println("4      5      " + (int)row4);
        System.out.println("5      6      " + (int)row5);

    }
}
