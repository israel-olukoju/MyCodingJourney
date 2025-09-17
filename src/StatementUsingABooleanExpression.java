public class StatementUsingABooleanExpression {
    public static void main(String[] args) {
       int count = 100;
       boolean newLine;
       boolean number = count % 10 == 0;
       if (number) {
           System.out.println("true");
       }
       else {
           System.out.println("false");
       }
    }
}