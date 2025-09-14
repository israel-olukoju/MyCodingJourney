import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the current time zone offset to GMT
        System.out.print("Enter the current time zone offset to GMT: ");
        long timeZone = input.nextLong();

        // Current time
        long currentTime = System.currentTimeMillis();

        // Current time is in milliseconds, convert milliseconds to seconds
        long seconds = currentTime / 1000;
        long currentSecond = seconds % 60;

        // Current time is in seconds, convert seconds to minutes
        long minutes = seconds / 60;
        long currentMinute = minutes % 60;

        // Current time is in minutes, convert minutes to hour
        long hour = minutes / 60;
        long currentHour = hour % 24;
        // West africa is my current location so, time zone is +1
        long westAfricaTime = currentHour + 1;

        // User's time zone
        long UserTimeZone = westAfricaTime + timeZone;

        // Display
        System.out.println("The current time is " + UserTimeZone + ":" + currentMinute + ":" + currentSecond);
    }
}
