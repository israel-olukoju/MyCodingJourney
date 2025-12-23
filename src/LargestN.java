public class LargestN {
    public static void main(String[] args) {
        int n = 0;
        while (n * n * n < 12000) {
            n++;
        }
        System.out.println("The largest integer is " + n);
    }
}