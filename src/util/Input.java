package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Give any string: ");
        String anyString = scanner.nextLine();
        return anyString;
    };

    boolean yesNo() {
        System.out.println("Enter 'y' if true or 'n' if false");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    };

//    int getInt(int min, int max) {
//        boolean confirm;
//        do {
//            System.out.println("Enter a number between 10 and 50: ");
//            int userNum = scanner.nextInt();
//            while (userNum < 10 || userNum >50)
//            confirm = scanner.next().equalsIgnoreCase("y");
//        } while(confirm);
//    };

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
//        System.out.println(input.getInt(10, 50));
    }
}
