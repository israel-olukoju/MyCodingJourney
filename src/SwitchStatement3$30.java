import java.util.Scanner;

public class SwitchStatement3$30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input x and y
        System.out.print("Enter x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        switch (x + 3) {
            case 6 : y = 1;
            default: y += 1;
        }
        if (x + 3 == 6) {
            System.out.println(y);
        }
        else {
            System.out.println(y += 1);
        }

    }
}
