public class ArithmeticExpression1 {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.6;
        double c = 2.2;

        // Arithmetic expression
        double arithmeticExpression = - b + Math.pow(Math.pow(b , 2) - 4 * a * c, 0.5) / 2 * a;

        // Display
        System.out.println(arithmeticExpression);
    }
}
