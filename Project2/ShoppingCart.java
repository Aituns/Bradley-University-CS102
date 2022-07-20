/* 
* Austin Bennett
* ShoppingList.java 
* Project 2
* This has all the methods for about everything in the project
*/

package Project2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    // initialize the variables and scanner
    List<Item> list = new ArrayList<Item>();
    Scanner sc = new Scanner(System.in);

    // prints all the items in the list exactly how they were ordered
    public void print() { // O(n)
        if (list.size() == 0)
            System.out.println("Add items to cart.");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i)._name + ":  $" + list.get(i)._cost);

    }

    // adds items to the list
    public void addItem() { // O(1) ignoring a user just spmming the wrong input type

        System.out.print("\nEnter Item: ");
        String name = sc.nextLine();

        // getting how much the item costs
        Double cost = 0.0;
        while (true) { // forces user to input a double for price
            System.out.print("Enter Cost ($): ");
            String costInput = sc.nextLine();
            try {
                cost = Double.parseDouble(costInput); // parses input for double
                break;
            } catch (NumberFormatException nfe) {

            }
        }

        // creates new item to add and adds it
        Item newItem = new Item(name, cost);
        list.add(newItem);
    }

    // adds multiple items for convience
    public void addMultiple() { // O(n) ignoring a user just spamming the wrong input type
        int num;
        while (true) { // forces user to input a int for items to add
            System.out.print("Enter number of Items: ");
            String numInput = sc.nextLine();
            try {
                num = Integer.parseInt(numInput); // parses input for int
                break;
            } catch (NumberFormatException nfe) {

            }
        }
        // runs through loop to add items
        for (int i = 0; i < num; i++) {
            addItem();
        }
    }

    public void removeItem() { // O(n) due to the Linear Search
        // gets item to remove
        System.out.print("Enter item to remove: ");
        String item = sc.nextLine();

        int index = LinearSearch.search(list, item); // gets index of item to search for

        if (index != -1) // if item is in list
            list.remove(index);
        else
            System.out.println("Not in shopping list");

    }

    // MergeSort based on name
    public void sortName() { // O(n log n)
        if (list.size() == 0)
            System.out.println("Add items to cart.");
        else {
            MergeSort.sort(list, 1);
            print();
        }
    }

    // MergeSort base on price
    public void sortCost() { // O(n log n)
        if (list.size() == 0)
            System.out.println("Add items to cart.");
        else {
            MergeSort.sort(list, 2);
            print();
        }
    }

    // returns result of the search
    public void search() { // O(n)
        if (list.size() == 0)
            System.out.println("Add items to cart.");
        else {
            System.out.print("Enter item to search for: ");
            String input = sc.nextLine();
            int index = LinearSearch.search(list, input);
            if (index != -1)
                System.out.println("Item is in cart at index " + index);
            else
                System.out.println("Item is not in cart.");
        }
    }

    // prints all the options
    public void PrintOptions() { // O(1)
        System.out.println();
        System.out.println("1. View Shopping Cart");
        System.out.println("2. Add Singular Item");
        System.out.println("3. Add Multiple Items");
        System.out.println("4. Remove Item");
        System.out.println("5. Sort by name");
        System.out.println("6. Sort by cost");
        System.out.println("7. Check if item is in cart");
        System.out.println("8. Show options");
        System.out.println("9. Checkout");
    }

    // totals the cart and prints the result
    public void checkout() { // O(n)
        Double total = 0.0;
        for (int i = 0; i < list.size(); i++)
            total += list.get(i)._cost;

        System.out.println("\nYour total is: $" + total);
        print();
    }

}
