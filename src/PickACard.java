public class PickACard {
    public static void main(String[] args) {
        // 52 cards in a deck
        int cardNumber = (int)(Math.random() * 52);

        // Rank and suit
        int rank = cardNumber % 13;
        int suit = cardNumber / 13;


        System.out.print("The card you picked is ");
        switch (rank) {
            case 0: System.out.print("Ace");
            break;
            case 10: System.out.print("Jack");
            break;
            case 11: System.out.print("Queen");
            break;
            case 12: System.out.print("King");
            break;
            default: System.out.print(rank + 1);
        }
        System.out.print(" of ");
        switch (suit) {
            case 0: System.out.print("Clubs");
            break;
            case 1: System.out.print("Diamonds");
            break;
            case 2: System.out.print("Hearts");
            break;
            case 3: System.out.print("Spades");
            break;
        }
    }
}
