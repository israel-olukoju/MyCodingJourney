import java.util.Scanner;

public class PoundsToKilogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the amount of pounds
        System.out.print("Enter the amount of pounds: ");
        double pounds = input.nextDouble();

        // Conversion of pounds to kilogram, where 1 pound is 0.454 kilogram
        double poundsToKilogram = pounds * 0.454; // 0.454 kilogram

        System.out.println(pounds + " pounds is " + poundsToKilogram + " kilogram");


    }
}
