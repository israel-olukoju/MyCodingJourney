import java.util.Scanner;

public class IfStatementThatAssign1ToX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        // Enter a number
        System.out.print("Enter a number: ");
        int y = input.nextInt();
        if (y > 0) {
            System.out.println("initial x = " + x + "\nnew x = " + (x + 1));
        }
    }
}
