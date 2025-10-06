import java.util.Scanner;

public class ConditionalOperator3$34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter your age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        int ticketPrice = 0;
        System.out.println(age >= 16 ? ticketPrice + 20 : ticketPrice + 10);
    }
}
