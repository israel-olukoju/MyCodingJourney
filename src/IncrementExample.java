public class IncrementExample {
    public static void main(String[] args) {
        int i = 10;
        int newNum = 10 * i++;
        System.out.println("i is " + i + " and the newNum is " + newNum);

        int j = 10;
        int newNum1 = 10 * ++j;
        System.out.println("j is " + j + " and the newNum1 is " + newNum1);

    }
}
