import java.util.Scanner;

public class PopulationProjectionWithUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the number of year(s)
        System.out.print("Enter the number of year(s): ");
        int years = input.nextInt();

        // Amount of seconds in a year
        int amountOfSecondsInAYear = 365 * 24 * 60 * 60;

        // Population projection
        int birthPerSecond = amountOfSecondsInAYear / 7; // Birth per second in a year
        int deathPerSecond = amountOfSecondsInAYear / 13; // Death per second in a year
        int newImmigrant = amountOfSecondsInAYear / 45; // New immigrant per second in a year
        int population = 312_032_486; // Population in a year
        int totalPopulation = birthPerSecond - deathPerSecond + newImmigrant; // Total population in a year
        int initialYear = (totalPopulation * years) + population; // totalPopulation is multiplied by the user input and then added to the population

        // Display
        System.out.println("The population in " + years + " year(s) is " + initialYear);


    }
}
