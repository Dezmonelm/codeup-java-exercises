import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//                Test your methods and verify the output.
        System.out.println(addNum(2, 5));
        System.out.println(subtractNum(9, 6));
        System.out.println(divideNum(7,3));
        System.out.println(multiplyNum(4, 2));
        System.out.println(remainder(8, 4));
        System.out.println(userInteger(5, 12));
        printFactorial();
        dicePair();
//        rollDice();
    }
        //Each function needs to take two parameters/arguments so that the operation can be performed.
        //Create four separate methods. Each will perform an arithmetic operation:
        //Addition
        public static int addNum(int num1, int num2) {
            return num1 + num2;
        }
        //Subtraction
        public static int subtractNum(int num1, int num2) {
            return num1 + num2;
        }
        //Multiplication
        public static int multiplyNum(int num1, int num2) {
            return num1 * num2;
        }
        //Division
        public static int divideNum(int num1, int num2) {
            return num1 / num2;
        }
        //Add a modulus method that finds the modulus of two numbers.
        public static int remainder(int num1, int num2) {
        return num1 % num2;
        }
//Food for thought: What happens if we try to divide by zero? What should happen?
//Bonus
//Create your multiplication method without the * operator (Hint: a loop might be helpful).
// Do the above with recursion.

//Create a method that validates that user input is in a certain range
//If the input is invalid, prompt the user again.

    public static int userInteger(int min, int max) {
        // user enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between min and max: ");
        int userInput = scanner.nextInt();
        //is number between min and max
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        // else return 0
        return userInteger(min, max);
        // if number is between min and max, return that number
    }

    //Calculate the factorial of a number.
    public static long calculateFactorial(int userFactorial) {
        //Display the factorial of the number entered by the user.
        int result = 1;
        //Use a for loop to calculate the factorial.
            for (int i = 1; i <= userFactorial; i++) {
                result *= i;
            }
        return result;
    }
    public static void printFactorial() {
        //Prompt the user to enter an integer from 1 to 10.
        Scanner factorialScanner = new Scanner(System.in);
        boolean confirm;
        do {
            System.out.println("Enter a number between 1 and 10: ");
            int userFactorial = factorialScanner.nextInt();
            //Assume that the user will enter an integer, but verify it’s between 1 and 10.
            while (userFactorial < 1 || userFactorial > 10) {
                System.out.println("HEY!! This is not a number between 1 and 10!");
                System.out.println("Enter a number between 1 and 10: ");
                userFactorial = factorialScanner.nextInt();
            }
            String middle = "";
            for (int x = 1; x <= userFactorial; x++) {
                if (x == 1) {
                    middle = middle + x;
                } else {
                    middle = middle + " x " + x;
                }
                //Use the long type to store the factorial.
                long result = calculateFactorial(x);
                //A factorial is a number multiplied by each of the numbers before it.
                //Factorials are denoted by the exclamation point (n!). Ex:
                System.out.printf("%d! = %-20s = %d\n", x, middle, result);
            }
            //Ask if the user wants to continue.
            System.out.println("Do you want to continue? (Y/N) ");
            //Continue only if the user agrees to.
            confirm = factorialScanner.next().equalsIgnoreCase("y");
        } while(confirm);
    }

    //Create an application that simulates dice rolling.
    public static int dicePair(){
        Scanner diceScanner = new Scanner(System.in);
        //Ask the user to enter the number of sides for a pair of dice.
        System.out.println("What number of sides would you like on a pair of dice?");
        int diceSides = diceScanner.nextInt();
        return diceSides;
    }

    //Prompt the user to roll the dice.
//    public static int rollDice(){
//        Scanner rollScanner = new Scanner(System.in);
//        System.out.println("Roll the dice");
        //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Scanner diceRolled = new Scanner(System.in);
        //Use static methods to implement the method(s) that generate the random numbers.
//        Random randomNum = new Random();
//        int randomDieNum = randomNum.nextInt((Math.random() * 7));

//        return randomDieNum;
//        return rollDice(min, max);
//    }



    //Use the .random method of the java.lang.Math class to generate random numbers.
}


