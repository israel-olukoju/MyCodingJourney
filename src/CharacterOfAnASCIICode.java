import java.util.Scanner;

public class CharacterOfAnASCIICode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for an ASCII code
        System.out.print("Enter an ASCII code: ");
        int ASCIICode = input.nextInt();

        // Checking if the range is from 0 to 127
        if (ASCIICode >= 0 && ASCIICode <= 127) {
            char ch = (char)ASCIICode;
            System.out.printf("The character for %d is %c", ASCIICode, ch);
        }
        else {
            System.out.println("OUT OF RANGE!!!");
        }
    }
}
