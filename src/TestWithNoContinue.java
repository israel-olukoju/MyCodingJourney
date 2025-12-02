public class TestWithNoContinue {
    public static void main(String[] args) {
        int sum = 0;
        int  number = 0;

        while (number < 20) {
            number++;
            if (number != 10 && number != 11) {
                sum += number;
                System.out.println("number: " + number);
            }
        }
        System.out.println("The sum is " + sum);
    }
}
