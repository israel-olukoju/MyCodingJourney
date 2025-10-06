import java.util.Scanner;

public class SwitchStatement3$31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter number within the range of 1 ~ 4
        System.out.print("Enter number (1 ~ 4): ");
        int a = input.nextInt();
        int x = 1;
        switch (a) {
            case 1: x += 5;
            break;
            case 2: x += 10;
            break;
            case 3: x += 16;
            break;
            case 4: x += 34;
            break;
            default: System.out.println("Wrong input");
            System.exit(0);
        }
        System.out.println(x);
    }
}
