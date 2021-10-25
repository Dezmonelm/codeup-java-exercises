import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        String name = "Dezmone";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        String greeting = "Salutations";
//        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
////        String userInput = scanner.next();
//        String userInput = scanner.nextLine();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.printf("You entered %s", userInput);

//        Copy this code into your main method:
        double pi = 3.14159;
//        Write some Java code that uses the variable pi to output the following:
//        The value of pi is approximately 3.14.
//        Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.printf("The value of pi is approximately %.2f" + "/n", pi);


//        Explore the Scanner Class.
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        System.out.print("Enter integer: ");
        int userInput = scanner.nextInt();

        System.out.printf("You entered: %s", userInput);

//        What happens if you input something that is not an integer?

        /* It throws an error because it is not an integer. */


//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.System.out.print("Enter integer: ");

        System.out.print("Enter three words: ");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.nextLine();

        System.out.printf("Your three words are: %s %s %s" + "/n", userString1, userString2, userString3);


//                What happens if you enter less than 3 words?
        /* It throws a missing expectation error */
//                What happens if you enter more than 3 words?
        /* exact same message */
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
        String userSentence = scanner.nextLine();

        System.out.println("Full sentence: " + userSentence);
//        do you capture all the words?
//                Rewrite the above example using the nextLine method.
//
//                Calculate the perimeter and area of Codeup's classrooms.
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.

        System.out.print("Please enter length and width:");
        float userLength = scanner.nextFloat();
        float userWidth = scanner.nextFloat();

        System.out.println("The length is: " + userLength + "\nThe width is: " + userWidth);

//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        System.out.println("The area is: " + (userLength * userWidth) + " sqft.");
        System.out.println("The perimeter is: " + (userLength * 2) + (userWidth * 2) + " ft.") ;

//                Bonuses
//        In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.
//
//        float userHeight = scanner.nextFloat();
//        float volume = userLength * userWidth + userHeight;
//        System.out.println("The Volume is: " + volume + "sqft.");

//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//

        System.out.format("%+010f dez", -123.1234);

//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.

    }
}
