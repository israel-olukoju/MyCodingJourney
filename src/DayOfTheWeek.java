import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter year, month, and the day of the month
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month (1~12): ");
        int month = input.nextInt();
        System.out.print("Enter day of the month: ");
        int dayOfTheMonth = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int century = year / 100;
        int yearOfTheCentury = year % 100;
        // Zeller’s congruence
        int h = (dayOfTheMonth + (26 * (month + 1) / 10) + yearOfTheCentury + (yearOfTheCentury / 4) + (century / 4) + (5 * century)) % 7;

        switch (h) {
            case 0: System.out.println("Day of the week is Saturday");
                break;
            case 1: System.out.println("Day of the week is Sunday");
                break;
            case 2: System.out.println("Day of the week is Monday");
                break;
            case 3: System.out.println("Day of the week is Tuesday");
                break;
            case 4: System.out.println("Day of the week is Wednesday");
                break;
            case 5: System.out.println("Day of the week is Thursday");
                break;
            case 6: System.out.println("Day of the week is Friday");
                break;
            default: System.out.println("They're seven days in a week");
                break;
        }
    }
}
