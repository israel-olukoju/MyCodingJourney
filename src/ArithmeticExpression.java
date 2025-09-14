public class ArithmeticExpression {

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        double d = 2;
        double r = 2;
        double t = 2;

        // First expression
        double firstExpression = 4.0 / 3.0 * (r + 34) - 9.0 * (a + b * c) + 3.0 + d * (2.0 + a) / a + b * d;

        // Second expression
        double secondExpression = 5.5 * Math.pow(r + 2.5, 2.5 + t);

        System.out.println("First expression is " + firstExpression + " and the second is " + secondExpression);
    }
}
