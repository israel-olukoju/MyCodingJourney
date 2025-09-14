public class AverageSpeedInKilometer {
    public static void main(String[] args) {
        // Runners data
        double givenMile = 24;
        double constKilometer = 1.6;
        double amtKilometer = givenMile * constKilometer;
        double avgKilometer = amtKilometer / 2;

        /* We were given 1hr40min35sec
        * it then converted to minute*/
        double amtTime = 100.35;
        double conAmtTime = amtTime / 60;
        double avgAmtTime = conAmtTime / 2;

        // Result
        double avgSpdKmHr = avgKilometer / avgAmtTime;
        System.out.println(avgSpdKmHr + " km/hr");
    }
}
