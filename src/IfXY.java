import java.util.Scanner;

public class IfXY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for x and y
        System.out.print("Enter a number for x (integers): ");
        int x = input.nextInt();
        System.out.print("Enter a number for y (integers): ");
        int y = input.nextInt();
        // X+Y
        int z = x + y;
        if (x > 2) {
            if (y > 2) {
                System.out.println(x + " + " + y + " = " + z);
            }
        } else {
            System.out.println("x is " + x);
        }
    }
}
