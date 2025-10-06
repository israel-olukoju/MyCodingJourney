import java.util.Scanner;

public class ConditionalOperator3$35c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter number that is multiple of 3
        System.out.print("Enter number that is multiple of 3: ");
        byte number = input.nextByte();

        if (number % 3 == 0) {
            System.out.println("i");
        }
        else {
            System.out.println("j");
        }
    }
}
