public class Exercise4$5 {
    public static void main(String[] args) {
        int number34To55 = 34 + (int)(Math.random() * 21);
        int number0To999 =(int)(Math.random() * 1000);
        double number5$5To55$5 = 5.5 + (Math.random() * 50.0);

        // Display
        System.out.println("Random number from 34 ~ 55 " + number34To55);
        System.out.println("Random number from 0 ~ 999 " + number0To999);
        System.out.println("Random number from 5.5 ~ 55.5 " + Math.round(number5$5To55$5 * 10) / 10.0);
    }
}
