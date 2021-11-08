package groceries;

import util.Input;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListApp {

    public static void main(String[] args) {
        Item[] list = GroceryArray.findAll();
        for (Item item : list) {
            System.out.println(item.getItemName());
        }
        Input input = new Input();
        System.out.println("Would you like to create a grocery list? (y/n)");
        String userInput = input.getString();
        int userInput2 = input.getInt();

        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("Would you like to enter a new item? (y/n)");

            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("What list do you want to make today?\n");
                //make some comments so you don't get lost from now on...ya know since you think you're a web developer and all now.....oh full stack at that ¯\_(ツ)_/¯
                System.out.println("0 - exit list\n1 - Baby List\n2 - Libations\n3 - Other Drinks\n4 - Bread & Bakery\n5 - Proteins\n6 - Produce\n7 - Canned Goods\n8 - Sweeties Indeedies\n");
                System.out.println();
                //should brig up BabyList items
                System.out.println("Enter a choice: ");
                list[] searchResult = new Item;
                if (userInput2 == 1) {
                    for (list item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Baby List")) {
                            searchResult = Arrays.copyOf(searchResult, );
                        }
                    }
                    System.out.println("Exiting list");

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
            System.out.println("SOMETHING ELSE WILL BE HERE LATER");
        }
//        boolean confirm;
//        do {
//
//            confirm = input.getString().equalsIgnoreCase("y");
//        } while (confirm);
    }
}
