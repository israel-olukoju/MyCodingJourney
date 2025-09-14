public class WhatWillBeTheDayIn100Days {
    public static void main(String[] args) {

        // Tuesday (2) is the second day of the week
        int Tuesday = 2;
        // The day in 100 days
        int dayInHundredDays = (Tuesday + 100) % 7;

        // Display
        System.out.println(dayInHundredDays);
    }
}
