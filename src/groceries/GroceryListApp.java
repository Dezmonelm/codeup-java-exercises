package groceries;

import util.Input;

import java.sql.SQLOutput;

public class GroceryListApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Would you like to create a grocery list? (y/n)");
        String userInput = input.getString();
        int userInput2 = input.getInt();

        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Would you like to enter a new item? (y/n)");

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("What list do you want to make today?\n");
                System.out.println("0 - exit list\n1 - Baby List\n2 - Libations\n3 - Other Drinks\n4 - Bread & Bakery\n5 - Proteins\n6 - Produce\n7 - Canned Goods\n8 - Sweeties Indeedies\n");
                System.out.println();
                System.out.println("Enter a choice: ");
                if (userInput2 == 0) {
                    boolean confirm;
                    do {
                        System.out.println("Would you like to make another list?");
                        confirm = input.getString().equalsIgnoreCase("y");

                    } while (confirm);

                }


            }else {
                System.out.println("SOMETHING WILL BE HERE LATER");
            }

        } else {
            System.out.println("SOMETHING WILL BE HERE LATER");
        }
//        boolean confirm;
//        do {
//
//            confirm = input.getString().equalsIgnoreCase("y");
//        } while (confirm);
    }
}
