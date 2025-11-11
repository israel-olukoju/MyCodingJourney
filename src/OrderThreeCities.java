import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three cities
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        // Arranging the city in ascending order
        if (firstCity.compareTo(secondCity) < 0 && secondCity.compareTo(thirdCity) < 0) {
            System.out.printf("The cities in alphabetical order are %s, %s, %s", firstCity, secondCity, thirdCity);
        } else if (secondCity.compareTo(firstCity) < 0 && firstCity.compareTo(thirdCity) < 0) {
            System.out.printf("The cities in alphabetical order are %s, %s, %s", secondCity, firstCity, thirdCity);
        }
        else {
            System.out.printf("The cities in alphabetical order are %s, %s, %s", thirdCity, secondCity, firstCity);
        }
    }
}