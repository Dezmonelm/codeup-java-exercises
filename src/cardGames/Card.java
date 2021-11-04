package cardGames;

public class Card {

    public String suit;
    public int value;

    public Card (String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public static String faceCards(Card royal) {
        String face = "";
        if (royal.value == 11) {
            face = "Jack";
        } else if (royal.value ==12) {
            face = "Queen";
        } else if (royal.value ==13) {
            face = "King";
        } else if (royal.value ==14) {
            face = "Ace";
        } else {
            face = String.valueOf(royal.value);
        }
        return face;
    }

}
