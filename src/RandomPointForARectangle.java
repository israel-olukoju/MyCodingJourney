public class RandomPointForARectangle {
    public static void main(String[] args) {
        int width = (int)(Math.random() * 100 + 1);
        int height = (int)(Math.random() * 200 + 1);
        System.out.println("The randomly generated co-ordinate is (width, height)");
        System.out.println("                                      (" + width + ", " + height + ")");

    }
}
