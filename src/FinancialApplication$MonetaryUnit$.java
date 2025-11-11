import java.util.Scanner;

public class FinancialApplication$MonetaryUnit$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter subtotal and gratuity rate
        System.out.print("Enter subtotal rate: ");
        String money = input.nextLine().trim();

        // Extracting the dollar and cent
        int k = money.indexOf('.');
        String dollar = money.substring(0, k);
        String cent = money.substring(k + 1);

        // Display
        System.out.printf("The dollar in $%s is $%s dollars and %s cents", money, dollar, cent);
    }
}
