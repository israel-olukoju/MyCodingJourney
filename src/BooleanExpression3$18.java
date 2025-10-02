public class BooleanExpression3$18 {
    public static void main(String[] args) {
        // x is 1
        int x = 1;

        if (true && (3 > 4)) {
            System.out.println("Not right");
        }
        if (!(x > 0) && (x > 0)) {
            System.out.println("False");
        }
        if ((x > 0) || (x < 0)) {
            System.out.println("True");
        }
        if (x != 0 || x == 0) {
            System.out.println("True");
        }
        if (x >= 0 || x < 0) {
            System.out.println("True");
        }
        if (x != 1 == !(x == 1)) {
            System.out.println("True");
        }
    }
}
