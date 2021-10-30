package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//
//        System.out.println("You tryna chill?");
//        System.out.println(input.yesNo());
//
//        int anotherNum = input.getInt(1, 100);
//        System.out.println(anotherNum);
//
//        System.out.println("Enter a whole number: ");
//        int userNum = input.getInt();
//        System.out.println(userNum);
//
//        System.out.println("Give a decimal number: ");
//        double myDouble = input.getDouble();
//        System.out.println(myDouble);

        double anotherDouble = input.getDouble(1, 100);
        System.out.println(anotherDouble);
    }
//
//    }
}
