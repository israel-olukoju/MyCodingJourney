import java.util.Scanner;

public class ConditionalOperator3$35a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter score and scale
        System.out.print("Enter score: ");
        int score = input.nextInt();
        System.out.print("Enter scale: ");
        int scale = input.nextInt();

        if (score > 10) {
            scale *= 3;
        }
        else {
            scale *= 4;
        }
        System.out.println(scale);
    }
}
