public class ComputeFutureTuition {
    /** Main method */
    public static void main(String[] args) {
        double tuition = 10000; // year 0
        int year = 0;
         while (year < 10) {
             tuition = tuition + (tuition * 0.05);
             year++;
             // The 4th year tuition
             if (year == 4) {
                 System.out.printf("The year is %d and the tuition is $%.2f%n", year, tuition);
             }
         }
        System.out.printf("The year is %d and the tuition is $%.2f%n", year, tuition);
    }
}
