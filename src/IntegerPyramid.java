import java.util.Scanner;

public class IntegerPyramid {
    /** Main method*/
    public static void main(String[] args) {
        // Scanner class
        Scanner input = new Scanner(System.in);
        // Prompt the user for an integer
        System.out.print("Enter an integer from 1 to 15 : ");
        int row = input.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int s = 1; s <= row - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
