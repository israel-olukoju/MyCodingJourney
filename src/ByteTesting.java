import java.util.Scanner;

public class ByteTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the correct number from the range <= 127:");
        byte number = scanner.nextByte();

        System.out.println("The number " + number + " is acceptable");
    }
}
