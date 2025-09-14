import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        // Minutes to hour
        long minutesToHour = minutes / 60;

        // Hour to day
        long hourToDay = minutesToHour / 24;

        // Day to year
       long dayToYear = hourToDay / 365; // After the hour has been converted to days, it was then converted to year by dividing the hourToDay / 365
       long remainingDays = hourToDay % 365; // The reaming days in the divided year in hourToDays is gotten by hourToDays % 365

        // Display
        System.out.println(minutes + " has " + dayToYear + " years and " + remainingDays + " days");
    }
}
