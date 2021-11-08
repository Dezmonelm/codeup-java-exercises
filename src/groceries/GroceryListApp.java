package groceries;

import util.Input;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListApp {

    public static void main(String[] args) {
        Item[] list = GroceryArray.findAll();
//        for (Item item : list) {
//            System.out.println(item.getItemName());
//        }
        Input input = new Input();
        System.out.println("Would you like to create a grocery list? (y/n)");
        String userInput = input.getString();
        System.out.println("anything");
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
                Item[] searchResult = new Item[0];
                if (userInput2 == 1) {
                    System.out.println(searchResult); //how do I return the actual search, not just the memory
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Baby List")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }


//                    boolean confirm;
//                    do {
//                        System.out.println("Would you like to make another list?");
//                        confirm = input.getString().equalsIgnoreCase("y");
//
//                    } while (confirm);

                } else if (userInput2 == 2) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Libations")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 3) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Other Drinks")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 4) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Bread & Bakery")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 5) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Proteins")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 6) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Produce")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 7) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Canned Goods")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                } else if (userInput2 == 8) {
                    for (Item item : list) {
                        if (item.getItemCategory().equalsIgnoreCase("Sweeties Indeedies")) {
                            searchResult = Arrays.copyOf(searchResult, searchResult.length + 1);
                            searchResult[searchResult.length - 1] = item;
                            System.out.println(item.getItemName() + " - " + item.getItemCategory());
                            //do something else with the return 'item'
                        }
                        System.out.println("Exiting list");
                    }
                }


            }else {
                System.out.println("SOMETHING WILL BE HERE LATER");
            }

        } else {
            System.out.println("Done with that list.");
        }
//        boolean confirm;
//        do {
//
//            confirm = input.getString().equalsIgnoreCase("y");
//        } while (confirm);
    }
}
