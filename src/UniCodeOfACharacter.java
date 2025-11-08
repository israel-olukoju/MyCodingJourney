import java.util.Scanner;

public class UniCodeOfACharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a character
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        // Display
        System.out.printf("The unicode for the character %c is %d", ch, (int)ch);
    }
}
