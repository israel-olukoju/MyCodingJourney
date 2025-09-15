import java.util.Scanner;

public class MonetaryUnit {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter amount
        System.out.print("Enter amount e.g, 1156: ");
        int amount = input.nextInt();

        // Monetary unit
        int dollarAmount = amount / 100;
        int centAmount = amount % 100;
        System.out.println(dollarAmount + " dollar(s) and " + centAmount + " cent(s)");
    }
}
