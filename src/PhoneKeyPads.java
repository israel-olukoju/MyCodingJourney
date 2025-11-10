import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a letter
        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toLowerCase();

        // Letters on each keypad
        boolean keyPad2 = letter.equals("a") || letter.equals("b") || letter.equals("c");
        boolean keyPad3 = letter.equals("d") || letter.equals("e") || letter.equals("f");
        boolean keyPad4 = letter.equals("g") || letter.equals("h") || letter.equals("i");
        boolean keyPad5 = letter.equals("j") || letter.equals("k") || letter.equals("l");
        boolean keyPad6 = letter.equals("m") || letter.equals("n") || letter.equals("o");
        boolean keyPad7 = letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s");
        boolean keyPad8 = letter.equals("t") || letter.equals("u") || letter.equals("v");
        boolean keyPad9 = letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z");

        // Assigning numbers
        if (keyPad2) {
            System.out.println("The corresponding number is 2");
        } else if (keyPad3) {
            System.out.println("The corresponding number is 3");
        } else if (keyPad4) {
            System.out.println("The corresponding number is 4");
        } else if (keyPad5) {
            System.out.println("The corresponding number is 5");
        } else if (keyPad6) {
            System.out.println("The corresponding number is 6");
        } else if (keyPad7) {
            System.out.println("The corresponding number is 7");
        } else if (keyPad8) {
            System.out.println("The corresponding number is 8");
        } else if (keyPad9) {
            System.out.println("The corresponding number is 9");
        }
        else {
            System.out.printf("%s is an invalid input", letter);
        }
    }
}
