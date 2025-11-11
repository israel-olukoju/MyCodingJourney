import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for SSN
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        // Checking the length
        if (ssn.length() != 11) {
            System.out.printf("%s is an invalid social security number", ssn);
            System.exit(1);
        }

        // Format for the SSN
        boolean hyphen = ssn.charAt(3) != '-' || ssn.charAt(6) != '-';
        boolean digit = !Character.isDigit(ssn.charAt(0)) || !Character.isDigit(ssn.charAt(1)) || !Character.isDigit(ssn.charAt(2)) || !Character.isDigit(ssn.charAt(4)) || !Character.isDigit(ssn.charAt(5)) ||
                        !Character.isDigit(ssn.charAt(7)) || !Character.isDigit(ssn.charAt(8)) || !Character.isDigit(ssn.charAt(9)) || !Character.isDigit(ssn.charAt(10));
        if (hyphen) {
            System.out.printf("%s is an invalid social security number", ssn);
        } else if (digit) {
            System.out.printf("%s is an invalid social security number", ssn);
        }
        else {
            System.out.printf("%s is a valid social security number", ssn);
        }
    }
}
