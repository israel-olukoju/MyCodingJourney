public class AverageSpeedInMiles {

    public static void main(String[] args) {
        // Runners data
        double givenKilometer = 14;
        double constKilometer = 1.6;
        double miles = givenKilometer / constKilometer;
        double averageMiles = miles / 2;

        // Time (min to hour)
        double hour = 60;
        double givenTime = 45.30;

        // Converted Time
        double givenTimeConvHour = givenTime / hour;
        double avgGivenTimeConvHour = givenTimeConvHour / 2;

        // Result
        double solution = averageMiles / avgGivenTimeConvHour;

        System.out.println(solution + " m/hr");
    }
}
