import java.util.Scanner;

public class HIghLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're about to play a guessing game!");
        int luckyNumber = (int)Math.floor(Math.random() * 100);
        int playerGuess;

        System.out.println("Go ahead! Take a guess!");

        do {

            System.out.println("Choose a number between 1 and 100. ");
            playerGuess = scanner.nextInt();

            if (playerGuess > luckyNumber) {
                System.out.println("OOOOOH A little LOWER!");
            } else if (playerGuess < luckyNumber) {
                System.out.println("OOOOOH A little HIGHER!");
            } else {
                System.out.println("VERR NICE! GUDE YOB!! aka GOOD GUESS!");
            }
        }while(playerGuess != luckyNumber);
    }
//Game Development 101
//Welcome to the world of game development!
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//The specs for the game are:
//Game picks a random number between 1 and 100.

//Prompts user to guess the number.

//All user inputs are validated.

//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".

//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//Use the random method of the java.lang.Math class to generate a random number.

//Bonus
//Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.




}
