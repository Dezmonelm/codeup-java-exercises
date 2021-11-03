import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're about to play a guessing game!");
        //Game picks a random number between 1 and 100.
        //Hints
        //Use the random method of the java.lang.Math class to generate a random number.
        int luckyNumber = (int)Math.floor(Math.random() * 100);
        int playerGuess;

        System.out.println("Go ahead! Take a guess!");

        do {

            //Prompts user to guess the number.
            System.out.println("Choose a number between 1 and 100. ");
            playerGuess = scanner.nextInt();

            //All user inputs are validated.
            //If user's guess is more than the number, it outputs "LOWER".
            if (playerGuess > luckyNumber) {
                System.out.println("OOOOOH A little LOWER!");
            //If user's guess is less than the number, it outputs "HIGHER".
            } else if (playerGuess < luckyNumber) {
                System.out.println("OOOOOH A little HIGHER!");
            //If a user guesses the number, the game should declare "GOOD GUESS!"
            } else {
                System.out.println("VERR NICE! GUDE YOB!! aka GOOD GUESS!");
            }
        }while(playerGuess != luckyNumber);
    }


//Bonus
//Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.




}
