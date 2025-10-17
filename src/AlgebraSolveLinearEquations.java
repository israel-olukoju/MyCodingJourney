public class AlgebraSolveLinearEquations {
    public static void main(String[] args) {
        // Solving for x
        double x = ((44.5 * .55) - (50.2 * 5.9) / (3.4 *  .55) - (50.2 * 2.1));
        System.out.println("3.4x + 50.2y = 44.5" + "\nx = " + x);

        // Solving for y
        double y = ((3.4 * 5.9) - (44.5 * 2.1) / (3.4 * .55) - (50.2 * 2.1));
        System.out.println("2.1x + .55y = 5.9" + "\ny = " + y);
    }
}
