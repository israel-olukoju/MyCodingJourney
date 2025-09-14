import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the temperature(t) in Fahrenheit and speed(v) in miles per seconds
        System.out.print("Enter the temperature in Fahrenheit between -58F and -41F: "); // How to check degree in PC
        float temperature = input.nextFloat();
        System.out.print("Enter the wind speed (>= 2) in miles per seconds: ");
        float speed = input.nextFloat();

        // Wind chill temperature
        float windChillTemperature = 35.74F + 0.6215F * temperature - 35.75F * (float) Math.pow(speed, 0.16) + 0.4275F * temperature * (float) Math.pow(speed, 0.16);

        // Display
        System.out.println("The wind chill index is " + windChillTemperature);
    }
}