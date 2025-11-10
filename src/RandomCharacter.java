public class RandomCharacter {
    public static void main(String[] args) {
        int random = 48 + (int)(Math.random() * 74);

        // Display
        System.out.printf("Randomly generated character %c", (char)random);
    }
}
