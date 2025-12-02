public class Exercise5$24b {
    public static void main(String[] args) {
        int balance = 10;

        while (true) {
            if (balance < 9) {
                continue;
            }
            balance = balance - 9;
        }
        // This is an unreachable statement
//        System.out.println("balance is " + balance);
    }
}
