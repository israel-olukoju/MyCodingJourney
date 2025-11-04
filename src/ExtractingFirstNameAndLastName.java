import java.util.Scanner;

public class ExtractingFirstNameAndLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt to enter first name and last name
        System.out.print("Enter first and last name: ");
        String fullName = input.nextLine();


        int k = fullName.indexOf(' '); // index of the empty space between the two string
        String firstName = fullName.substring(0, k); // From index 0 to the index of the empty space between the strings
        String lastName = fullName.substring(k + 1); // Index from empty space + 1 (it will start the index from the index after the space) to the last index
        String message = "Full name: " + fullName;

        // Display
        System.out.println("Welcome, " + message.substring(11)); // The substring(index) index counts from 1 not 0
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}
