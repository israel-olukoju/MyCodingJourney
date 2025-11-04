public class Exercise4$19 {
    public static void main(String[] args) {
        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1)); // \u0001 is 1 in uni-code
        System.out.println(1 + "Welcome " + 'a' + 1); // The theory of a number before string during concatenation affects char
    }
}
