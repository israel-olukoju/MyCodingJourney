import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for letter
        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toUpperCase();
        char ch = letter.charAt(0);
        // Vowels and consonant
        String vowels = "AEIOU";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZ";

        // Checking for vowel letter
        char v1 = vowels.charAt(0);
        char v2 = vowels.charAt(1);
        char v3 = vowels.charAt(2);
        char v4 = vowels.charAt(3);
        char v5 = vowels.charAt(4);

        char c1 = consonants.charAt(0);
        char c2 = consonants.charAt(1);
        char c3 = consonants.charAt(2);
        char c4 = consonants.charAt(3);
        char c5 = consonants.charAt(4);
        char c6 = consonants.charAt(5);
        char c7 = consonants.charAt(6);
        char c8 = consonants.charAt(7);
        char c9 = consonants.charAt(8);
        char c10 = consonants.charAt(9);
        char c11 = consonants.charAt(10);
        char c12 = consonants.charAt(11);
        char c13 = consonants.charAt(12);
        char c14 = consonants.charAt(13);
        char c15 = consonants.charAt(14);
        char c16 = consonants.charAt(15);
        char c17 = consonants.charAt(16);
        char c18 = consonants.charAt(17);
        char c19 = consonants.charAt(18);
        char c20 = consonants.charAt(19);
        char c21 = consonants.charAt(20);

        // Checking if the user input is equal to vowel or consonant
        boolean vowel = ch == v1 || ch == v2 || ch == v3 || ch == v4 || ch == v5;
        boolean consonant = ch == c1 || ch == c2 || ch == c3 || ch == c4 || ch == c5 ||
                            ch == c6 || ch == c7 || ch == c8 || ch == c9 || ch == c10 ||
                            ch == c11 || ch == c12 || ch == c13 || ch == c14 || ch == c15 ||
                            ch == c16 || ch == c17 || ch == c18 || ch == c19 || ch == c20 ||
                            ch == c21;
        if (vowel) {
            System.out.printf("%s is a vowel", letter);
        } else if (consonant) {
            System.out.printf("%s is a consonant", letter);
        }
        else {
            System.out.printf("%s is an invalid input", letter);
        }
    }
}
