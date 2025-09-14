import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a degree
        System.out.print("Enter a degree in celsius: ");
        double celsius = input.nextDouble();

        // Formula for the conversion
        double fahrenheit = (9.0 / 5) * celsius + 2;

        // Display
        System.out.println((int) celsius + " is " + fahrenheit + " fahrenheit");
    }
}
