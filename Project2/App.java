/* 
* Austin Bennett
* App.java 
* Project 2
* This has the main method and handles the menu
*/

package Project2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // initialize the list and the scanner
        ShoppingCart shoppingList = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        // show the options initially
        shoppingList.PrintOptions();

        // Main loop
        while (true) {

            // Get input from user
            System.out.print("\nWhat would you like to do? (Type 8 to view options again): ");
            String input;
            input = sc.nextLine();

            switch (input) { // switch method to run menu. using strings to prevent issues with user entering
                             // possible wrong type
                case "1": // Print Items
                    shoppingList.print();
                    break;
                case "2": // Add single item
                    shoppingList.addItem();
                    break;
                case "3": // Add multiple items
                    shoppingList.addMultiple();
                    break;
                case "4": // remove item
                    shoppingList.removeItem();
                    break;
                case "5": // sort by name
                    shoppingList.sortName();
                    break;
                case "6": // sort by cost
                    shoppingList.sortCost();
                    break;
                case "7": // search the list for item
                    shoppingList.search();
                    break;
                case "8": // print the options again
                    shoppingList.PrintOptions();
                    break;
                case "9": // Checkout
                    shoppingList.checkout();
                    System.exit(0);
                default: // used if user inputs a non valid choice
                    System.out.println("Invalid Choice");
            }

        }

    }
}
