import java.util.Scanner;

public class FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter today's day and the number of days elapsed since today
        System.out.print("Enter today's day: ");
        int userTodayDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int userElapsedDay = input.nextInt();

        // To measure the elapsed day
        int elapsedDay = (userTodayDay + userElapsedDay) % 7;

        if (userTodayDay == 0 && elapsedDay == 0) {
            System.out.println("Today is sunday and the future day is sunday");
        } else if (userTodayDay == 0 && elapsedDay == 1) {
            System.out.println("Today is sunday and the future day is monday");
        } else if (userTodayDay == 0 && elapsedDay == 2) {
            System.out.println("Today is sunday and the future day is tuesday");
        } else if (userTodayDay == 0 && elapsedDay == 3) {
            System.out.println("Today is sunday and the future day is wednesday");
        } else if (userTodayDay == 0 && elapsedDay == 4) {
            System.out.println("Today is sunday and the future day is thursday");
        } else if (userTodayDay == 0 && elapsedDay == 5) {
            System.out.println("Today is sunday and the future day is friday");
        } else if (userTodayDay == 0 && elapsedDay == 6) {
            System.out.println("Today is sunday and the future day is saturday");
        } else if (userTodayDay == 1 && elapsedDay == 0) {
            System.out.println("Today is monday and the future day is sunday");
        } else if (userTodayDay == 1 && elapsedDay == 1) {
            System.out.println("Today is monday and the future day is monday");
        } else if (userTodayDay == 1 && elapsedDay == 2) {
            System.out.println("Today is monday and the future day is tuesday");
        } else if (userTodayDay == 1 && elapsedDay == 3) {
            System.out.println("Today is monday and the future day is wednesday");
        } else if (userTodayDay == 1 && elapsedDay == 4) {
            System.out.println("Today is monday and the future day is thursday");
        } else if (userTodayDay == 1 && elapsedDay == 5) {
            System.out.println("Today is monday and the future day is friday");
        } else if (userTodayDay == 1 && elapsedDay == 6) {
            System.out.println("Today is monday and the future day is saturday");
        } else if (userTodayDay == 2 && elapsedDay == 0) {
            System.out.println("Today is tuesday and the future day is sunday");
        } else if (userTodayDay == 2 && elapsedDay == 1) {
            System.out.println("Today is tuesday and the future day is monday");
        } else if (userTodayDay == 2 && elapsedDay == 2) {
            System.out.println("Today is tuesday and the future day is tuesday");
        } else if (userTodayDay == 2 && elapsedDay == 3) {
            System.out.println("Today is tuesday and the future day is wednesday");
        } else if (userTodayDay == 2 && elapsedDay == 4) {
            System.out.println("Today is tuesday and the future day is thursday");
        } else if (userTodayDay == 2 && elapsedDay == 5) {
            System.out.println("Today is tuesday and the future day is friday");
        } else if (userTodayDay == 2 && elapsedDay == 6) {
            System.out.println("Today is tuesday and the future day is saturday");
        } else if (userTodayDay == 3 && elapsedDay == 0) {
            System.out.println("Today is wednesday and the future day is sunday");
        } else if (userTodayDay == 3 && elapsedDay == 1) {
            System.out.println("Today is wednesday and the future day is monday");
        } else if (userTodayDay == 3 && elapsedDay == 2) {
            System.out.println("Today is wednesday and the future day is tuesday");
        } else if (userTodayDay == 3 && elapsedDay == 3) {
            System.out.println("Today is wednesday and the future day is wednesday");
        } else if (userTodayDay == 3 && elapsedDay == 4) {
            System.out.println("Today is wednesday and the future day is thursday");
        } else if (userTodayDay == 3 && elapsedDay == 5) {
            System.out.println("Today is wednesday and the future day is friday");
        } else if (userTodayDay == 3 && elapsedDay == 6) {
            System.out.println("Today is wednesday and the future day is saturday");
        } else if (userTodayDay == 4 && elapsedDay == 0) {
            System.out.println("Today is thursday and the future day is sunday");
        } else if (userTodayDay == 4 && elapsedDay == 1) {
            System.out.println("Today is thursday and the future day is monday");
        } else if (userTodayDay == 4 && elapsedDay == 2) {
            System.out.println("Today is thursday and the future day is tuesday");
        } else if (userTodayDay == 4 && elapsedDay == 3) {
            System.out.println("Today is thursday and the future day is wednesday");
        } else if (userTodayDay == 4 && elapsedDay == 4) {
            System.out.println("Today is thursday and the future day is thursday");
        } else if (userTodayDay == 4 && elapsedDay == 5) {
            System.out.println("Today is thursday and the future day is friday");
        } else if (userTodayDay == 4 && elapsedDay == 6) {
            System.out.println("Today is thursday and the future day is saturday");
        } else if (userTodayDay == 5 && elapsedDay == 0) {
            System.out.println("Today is friday and the future day is sunday");
        } else if (userTodayDay == 5 && elapsedDay == 1) {
            System.out.println("Today is friday and the future day is monday");
        } else if (userTodayDay == 5 && elapsedDay == 2) {
            System.out.println("Today is friday and the future day is tuesday");
        } else if (userTodayDay == 5 && elapsedDay == 3) {
            System.out.println("Today is friday and the future day is wednesday");
        } else if (userTodayDay == 5 && elapsedDay == 4) {
            System.out.println("Today is friday and the future day is thursday");
        } else if (userTodayDay == 5 && elapsedDay == 5) {
            System.out.println("Today is friday and the future day is friday");
        } else if (userTodayDay == 5 && elapsedDay == 6) {
            System.out.println("Today is friday and the future day is saturday");
        } else if (userTodayDay == 6 && elapsedDay == 0) {
            System.out.println("Today is saturday and the future day is sunday");
        } else if (userTodayDay == 6 && elapsedDay == 1) {
            System.out.println("Today is saturday and the future day is monday");
        } else if (userTodayDay == 6 && elapsedDay == 2) {
            System.out.println("Today is saturday and the future day is tuesday");
        } else if (userTodayDay == 6 && elapsedDay == 3) {
            System.out.println("Today is saturday and the future day is wednesday");
        } else if (userTodayDay == 6 && elapsedDay == 4) {
            System.out.println("Today is saturday and the future day is thursday");
        } else if (userTodayDay == 6 && elapsedDay == 5) {
            System.out.println("Today is saturday and the future day is friday");
        } else if (userTodayDay == 6 && elapsedDay == 6) {
            System.out.println("Today is saturday and the future day is saturday");
        } else if (userTodayDay == 7 && elapsedDay == 0) {
            System.out.println("Today is sunday and the future day is sunday");
        } else if (userTodayDay == 7 && elapsedDay == 1) {
            System.out.println("Today is sunday and the future day is monday");
        } else if (userTodayDay == 7 && elapsedDay == 2) {
            System.out.println("Today is sunday and the future day is tuesday");
        } else if (userTodayDay == 7 && elapsedDay == 3) {
            System.out.println("Today is sunday and the future day is wednesday");
        } else if (userTodayDay == 7 && elapsedDay == 4) {
            System.out.println("Today is sunday and the future day is thursday");
        } else if (userTodayDay == 7 && elapsedDay == 5) {
            System.out.println("Today is sunday and the future day is friday");
        } else if (userTodayDay == 7 && elapsedDay == 6) {
            System.out.println("Today is sunday and the future day is saturday");
        }
        else {
            System.out.println("They're 7 days in a month");
        }
    }
}
