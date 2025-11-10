import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two characters
        System.out.print("Enter two characters: ");
        String character = input.nextLine();

        // Integer character
        char ch2 = character.charAt(1);

       if (character.startsWith("M")) {
           switch (ch2) {
               case '1':
                   System.out.println("Mathematics Freshman");
                   break;
               case '2':
                   System.out.println("Mathematics Sophomore");
                   break;
               case '3':
                   System.out.println("Mathematics junior");
                   break;
               case '4':
                   System.out.println("Mathematics Senior");
           }
       } else if (character.startsWith("C")) {
           
               switch (ch2) {
                   case '1':
                       System.out.println("Computer Science Freshman");
                       break;
                   case '2':
                       System.out.println("Computer Science Sophomore");
                       break;
                   case '3':
                       System.out.println("Computer Science junior");
                       break;
                   case '4':
                       System.out.println("Computer Science Senior");
               }           
       } else if (character.startsWith("I")) {
               switch (ch2) {
                   case '1':
                       System.out.println("Information Technology Freshman");
                       break;
                   case '2':
                       System.out.println("Information Technology Sophomore");
                       break;
                   case '3':
                       System.out.println("Information Technology junior");
                       break;
                   case '4':
                       System.out.println("Information Technology Senior");
               }
       }
       else {
           System.out.println("Invalid input");
       }
    }
}
