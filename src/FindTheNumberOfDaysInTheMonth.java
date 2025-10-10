import java.util.Scanner;

public class FindTheNumberOfDaysInTheMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter month in int and year
        System.out.print("Enter the number of month (e.g, april is 4): ");
        int numberOfMonth = input.nextInt();
        System.out.print("Enter the year (e.g, 2000): ");
        int year = input.nextInt();

        // Leap year to add one day to february
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        if (leapYear) {
            switch (numberOfMonth) {
                case 1: System.out.println("January " + year + " had 31 days");
                    break;
                case 2: System.out.println("February " + year + " had 29 days");
                    break;
                case 3: System.out.println("March " + year + " had 31 days");
                    break;
                case 4: System.out.println("April " + year + " had 30 days");
                    break;
                case 5: System.out.println("May " + year + " had 31 days");
                    break;
                case 6: System.out.println("June " + year + " had 30 days");
                    break;
                case 7: System.out.println("July " + year + " had 31 days");
                    break;
                case 8: System.out.println("August " + year + " had 31 days");
                    break;
                case 9: System.out.println("September " + year + " had 30 days");
                    break;
                case 10: System.out.println("October " + year + " had 31 days");
                    break;
                case 11: System.out.println("November " + year + " had 30 days");
                    break;
                case 12: System.out.println("December " + year + " had 31 days");
                    break;
                default: System.out.println("Enter number 1 to 12 for the month");
                    break;
            }
        }
        else {
            switch (numberOfMonth) {
                case 1: System.out.println("January " + year + " had 31 days");
                    break;
                case 2: System.out.println("February " + year + " had 28 days");
                    break;
                case 3: System.out.println("March " + year + " had 31 days");
                    break;
                case 4: System.out.println("April " + year + " had 30 days");
                    break;
                case 5: System.out.println("May " + year + " had 31 days");
                    break;
                case 6: System.out.println("June " + year + " had 30 days");
                    break;
                case 7: System.out.println("July " + year + " had 31 days");
                    break;
                case 8: System.out.println("August " + year + " had 31 days");
                    break;
                case 9: System.out.println("September " + year + " had 30 days");
                    break;
                case 10: System.out.println("October " + year + " had 31 days");
                    break;
                case 11: System.out.println("November " + year + " had 30 days");
                    break;
                case 12: System.out.println("December " + year + " had 31 days");
                    break;
                default: System.out.println("Enter number 1 to 12 for the month");
                    break;
            }
        }
    }
}
