import java.util.Scanner;

public class CheckSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two strings
        System.out.print("Enter string1: ");
        String str1 = input.nextLine();
        System.out.print("Enter string1: ");
        String str2 = input.nextLine();

        if (str1.contains(str2)) {
            System.out.printf("%s is a substring of %s", str2, str1);
        }
        else {
            System.out.printf("%s is not a substring of %s", str2, str1);
        }
    }
}
