import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for year and month
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Leap year
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days;
        if (leapYear) {
            if (month.startsWith("Jan")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Feb")) {
                days = 29;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Mar")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Apr")) {
                days = 30;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("May")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Jun")) {
                days = 30;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Jul")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Aug")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Sep")) {
                days = 30;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Oct")) {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            } else if (month.startsWith("Nov")) {
                days = 30;
                System.out.printf("%s %d has %d days", month, year, days);
            } else {
                days = 31;
                System.out.printf("%s %d has %d days", month, year, days);
            }
        }
        else {
                if (month.startsWith("Jan")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Feb")) {
                    days = 28;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Mar")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Apr")) {
                    days = 30;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("May")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Jun")) {
                    days = 30;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Jul")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Aug")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Sep")) {
                    days = 30;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Oct")) {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else if (month.startsWith("Nov")) {
                    days = 30;
                    System.out.printf("%s %d has %d days", month, year, days);
                } else {
                    days = 31;
                    System.out.printf("%s %d has %d days", month, year, days);
                }
        }
    }
}
