package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input() {
        scanner = new Scanner(System.in);
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

    int getInt() {
        return this.scanner.nextInt();
    }

    double getDouble(double min, double max) {
        Double userDouble;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
        } while (userDouble > max || userDouble < min);
        return userDouble;
    }

    double getDouble() {
        return this.scanner.nextDouble();
    }

}
