package cardGames;

import util.Input;

import java.util.Arrays;

public class War {

//    public static void shuffleDeck(){
//        for (Card card : CardsArray.shuffle()){
//            System.out.printf("%d of %s%n", card.value, card.suit);
//        }
    public static void main(String[] args) {


        Card[] deck = CardsArray.getAllCards();
        for (Card card : deck) {
            System.out.println(card.value + " of " +card.suit);
        }

        Player dez = new Player("Dezmone", 0);
        Player shan = new Player("Shanshan", 0);

        System.out.println(Arrays.toString(deck));


    }
//    public static Card dealCards () {

// random card method
//        public static int drawCard(){
//            int randomCard = (int) Math.floor(Math.random() * CardsArray.getAllCards().length+1);
//            return randomCard;
//        }


//    }
}

// random number
// public static int randomInt(int Min, int Max) {
//        return (int) (Math.random() * (Max - Min)) + Min;
//    }