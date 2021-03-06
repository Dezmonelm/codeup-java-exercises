package cardGames;

import java.util.Random;

public class CardsArray {
    public static Card[] getAllCards() {
        return new Card[] {
        new Card("Spades", 2),
        new Card("Spades", 3),
        new Card("Spades", 4),
        new Card("Spades", 5),
        new Card("Spades", 6),
        new Card("Spades", 7),
        new Card("Spades", 8),
        new Card("Spades", 9),
        new Card("Spades", 10),
        new Card("Spades", 11),
        new Card("Spades", 12),
        new Card("Spades", 13),
        new Card("Spades", 14),
        new Card("Diamonds", 2),
        new Card("Diamonds", 3),
        new Card("Diamonds", 4),
        new Card("Diamonds", 5),
        new Card("Diamonds", 6),
        new Card("Diamonds", 7),
        new Card("Diamonds", 8),
        new Card("Diamonds", 9),
        new Card("Diamonds", 10),
        new Card("Diamonds", 11),
        new Card("Diamonds", 12),
        new Card("Diamonds", 13),
        new Card("Diamonds", 14),
        new Card("Clubs", 2),
        new Card("Clubs", 3),
        new Card("Clubs", 4),
        new Card("Clubs", 5),
        new Card("Clubs", 6),
        new Card("Clubs", 7),
        new Card("Clubs", 8),
        new Card("Clubs", 9),
        new Card("Clubs", 10),
        new Card("Clubs", 11),
        new Card("Clubs", 12),
        new Card("Clubs", 13),
        new Card("Clubs", 14),
        new Card("Hearts", 2),
        new Card("Hearts", 3),
        new Card("Hearts", 4),
        new Card("Hearts", 5),
        new Card("Hearts", 6),
        new Card("Hearts", 7),
        new Card("Hearts", 8),
        new Card("Hearts", 9),
        new Card("Hearts", 10),
        new Card("Hearts", 11),
        new Card("Hearts", 12),
        new Card("Hearts", 13),
        new Card("Hearts", 14)
        };
    }
    public static Card[] shuffle() {
        Card[] deck = CardsArray.getAllCards();

        for (int i = deck.length - 1; i > 0; i--) {
            int rand = (int)(Math.random() * (i + 1));
            Card dealingDeck = deck[i];
            deck[i] = deck[rand];
            deck[rand] = dealingDeck;
        }
        return deck;
    }
}
