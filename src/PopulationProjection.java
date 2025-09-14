public class PopulationProjection {

    public static void main(String[] args) {
        // Amount of seconds in a year
        int amtSecYr = 365 * 24 * 60 * 60; // Amount of seconds in a year

        // Population projection
        int birthPopulation = amtSecYr / 7;
        int deathPopulation = amtSecYr / 13;
        int immigrantPopulation = amtSecYr / 45;

        // Total population
        int population = 312_032_486;
        int totalPopulation = birthPopulation - deathPopulation + immigrantPopulation;
        int firstYear = population + totalPopulation;
        int secondYear = firstYear + totalPopulation;
        int thirdYear = secondYear + totalPopulation;
        int forthYear = thirdYear + totalPopulation;
        int fifthYear = forthYear + totalPopulation;

        // The display
        System.out.println("First year: " + firstYear + "\nSecond year: " + secondYear + "\nThird year: " + thirdYear + "\nForth year: " + forthYear + "\nFifth year: " + fifthYear);
        System.out.println(totalPopulation + population);
    }
}
