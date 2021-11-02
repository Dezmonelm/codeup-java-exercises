import java.util.Random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

    static String[] adjectives = {"jolly", "late", "tedious", "politcal", "axiomatic", "bouncy", "debonair", "ten", "alive", "delirious"};
    static String[] nouns = {"shopping", "singer", "piano", "chapter", "unit", "advice", "ad", "bedroom", "construction", "math"};

//Create a method that will return a random element from an array of strings.
    public static String randomElement(String[] wordsArray) {
        Random random = new Random();
        String theWord = wordsArray[random.nextInt(wordsArray.length)];
        return theWord;
    }

//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
public static void main(String[] args) {
//    System.out.println(randomElement(adjectives));
//    System.out.println(randomElement(nouns));
    System.out.println("Check out this server name: " + randomElement(adjectives) + "-" + randomElement(nouns));
}
}
