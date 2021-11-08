package util;

import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Input {
    private Scanner scanner;


    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        System.out.println("Give any string: ");
        return this.scanner.nextLine();
    };

    boolean yesNo() {
        String answer = scanner.nextLine();
        System.out.println("Enter 'y' if true or 'n' if false");
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    };

    int getInt(int min, int max) {
        int userNum;


        do {
            System.out.println("Enter a number between 10 and 50: ");
            userNum = this.scanner.nextInt();

        } while(min > 10 || max < 50);
        return userNum;
    };

    public int getInt() {
        try {
            return Integer.parseInt(this.scanner.nextLine());
        } catch (Exception e){
            System.out.println("Please enter a number, not a word.");
            return getInt();
        }


    }

    double getDouble(double min, double max) {
        Double userDouble;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
        } while (userDouble > max || userDouble < min);
        return userDouble;
    }

    public double getDouble() {
        try {
            return Double.parseDouble(this.scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Please enter a number, not a word.");
            return getDouble();
        }
    }

//    public double getBinary() {
//        try {
//            return Double.parseDouble(this.scanner.nextLine());
//        } catch (Exception e) {
//            System.out.println();
//        }
//
//
//    }

}
