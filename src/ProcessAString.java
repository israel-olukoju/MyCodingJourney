import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for string
        System.out.print("Enter a string: ");
        String str = input.nextLine().trim();

        // First character
        char ch = str.charAt(0);

        // Display
        System.out.printf("The length of the string is %d and the first character is %c", str.length(), ch);
    }
}
