public class GenerateVehiclePlateNumber {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 9999);
        int upperCase1 = 65 + (int)(Math.random() * 25) + 1;
        int upperCase2 = 65 + (int)(Math.random() * 25) + 1;
        int upperCase3 = 65 + (int)(Math.random() * 25) + 1;

        // Uppercase
        char ch1 = (char)upperCase1;
        char ch2 = (char)upperCase2;
        char ch3 = (char)upperCase3;

        // Number
        int number1 = random / 1000 % 10;
        int number2 = random / 100 % 10;
        int number3 = random / 10 % 10;
        int number4 = random % 10;

        // Display
        System.out.printf("Your plate number %c%c%c%d%d%d%d", ch1, ch2, ch3, number1, number2, number3, number4);
    }
}
