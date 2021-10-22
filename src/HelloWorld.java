public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World! ");
        System.out.println("Hello, Dez!");
        System.out.print("Hello, ");
        System.out.println("World! ");

//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 24;
        System.out.println(myFavoriteNumber);

//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        String myString = "This isn't so bad.";
        System.out.println(myString);

//                Change your code to assign a character value to myString. What do you notice?
//        Change your code to assign the value 3.14159 to myString. What happens?
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        //        Change your code to assign the value 3.14 to myNumber. What do you notice?
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        Change your code to assign the value 123 to myNumber.
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

        long myNumber = 123;
        System.out.println(myNumber);


//                Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        float myNumber1 = 3.14F;
        float myNumber1 = (float) 3.14;
        System.out.println(myNumber1);



//                Copy and paste the following code blocks one at a time and execute them
//
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        What is the difference between the above code blocks? Explain why the code outputs what it does.

        /* The first one take in the 5 and then increments to 6. the second immediately increments to six and the takes the value of again */

//                Try to create a variable named class. What happens?

        /* class is a reserved word and cannot be used in any way it is not reserved for. */

//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        Copy and paste the code above and then run it. Does the result match with your expectation?
//
//                How is the above example different from the code block below?
//
//
//        int three = (int) "three";
//        What are the two different types of errors we are observing?
//
//                /** int three = (int) o; expects a ClassCastExpectation
//                *  int three = (int) "three"; String cannot be converted to int
//                * a string cannot cast into an integer
//                */

//                Rewrite the following expressions using the relevant shorthand assignment operators:


//        int x = 4;
//        x = x + 5;
//            x += 5;
//            System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//            y *= x;
//        System.out.println(y);


        int x = 10;
        int y = 2;
//        x = x / y;
            x /= y;
        System.out.println(x);
//        y = y - x;
            y -=x;
        System.out.println(y);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

//        byte tooMuch = 128; /* value is higher than precision so the variable type will not run. */
        byte tooClose = 127;
        tooClose +=100;
        System.out.println(tooClose);
        /* value will only increment one value past its variable type limit and WILL NOT SHOW AN ERROR */

        final int SIDE_OF_DICE = 6;
        System.out.println(SIDE_OF_DICE);

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(pi);
        System.out.println(almostPi);



        int aNumber = Integer.MAX_VALUE;
//        int aNumber = Integer.MAX_VALUE + 1;
        System.out.println(aNumber);
    }
}
