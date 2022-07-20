/* 
* Austin Bennett
* LinearSearch.java 
* Project 2
* This handles searching the list
*/

package Project2;

import java.util.List;

public class LinearSearch {
    // runs through all elements until it find the one it's looking for
    static public int search(List<Item> list, String input) { // O(n)
        int index = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)._name.toLowerCase().equals(input.toLowerCase())) {
                index = i;
            }
        }
        return index;
    }
}
