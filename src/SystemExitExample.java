import java.util.Scanner;

public class SystemExitExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input of 1(start) and 0 (quit)
        System.out.print("Enter 1(start) and 0(quit): ");
        byte menu = input.nextByte();

        if (menu == 1) {
            System.out.println("Loading......");
        }
        else {
            System.out.println("Exit");
            System.exit(0);
        }
    }
}
