import java.util.Scanner;

public class CurrentTimeWith12HoursFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for time zone offset to GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();

        // Total milliseconds
        long milliseconds = System.currentTimeMillis();
        // Milliseconds to seconds
        long totalSeconds = milliseconds / 1000;
        // Seconds
        long seconds = totalSeconds % 60;
        // Total minutes
        long totalMinutes = totalSeconds / 60;
        // Minutes
        long minutes = totalMinutes % 60;
        // Total hours
        long totalHours = totalMinutes / 60;
        // Hours
        long hours = totalHours % 12 + timeZone;

        // Display
        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds + " AM");
    }
}
