/* 
* Austin Bennett
* MergeSort.java 
* Project 2
* This handles sorting the list
*/

package Project2;

import java.util.*;
import java.util.ArrayList;

public class MergeSort {
  public static void sort(List<Item> list, int sortBy) {
    if (list.size() < 2) { // check to make sure that list can be sorted
      return;
    }
    int mid = list.size() / 2; // Getting the midpoint
    List<Item> left = new ArrayList<Item>(list.subList(0, mid)); // left sub list
    List<Item> right = new ArrayList<Item>(list.subList(mid, list.size())); // right sub list

    // recursive sorting for left and right trees until the list size is 1
    sort(left, sortBy);
    sort(right, sortBy);

    merge(left, right, list, sortBy);
  }

  // merges the l and r lists
  private static void merge(
      List<Item> left, List<Item> right, List<Item> list, int sortBy) {
    int lIndex = 0;
    int rIndex = 0;
    int listIndex = 0;

    // sorting
    while (lIndex < left.size() && rIndex < right.size()) {

      // if sortBy is 1 -> sort by name
      if (sortBy == 1) {
        if (left.get(lIndex)._name.compareTo(right.get(rIndex)._name) < 0) {
          list.set(listIndex++, left.get(lIndex++)); // sets the new element
        } else {
          list.set(listIndex++, right.get(rIndex++)); // sets the new element
        }
      }
      // if sortBy is 2 -> sort by cost
      if (sortBy == 2) {
        if (left.get(lIndex)._cost.compareTo(right.get(rIndex)._cost) < 0) {
          list.set(listIndex++, left.get(lIndex++)); // sets the new element
        } else {
          list.set(listIndex++, right.get(rIndex++)); // sets the new element
        }
      }
    }

    while (lIndex < left.size()) {
      list.set(listIndex++, left.get(lIndex++)); // sets the new element
    }
    while (rIndex < right.size()) {
      list.set(listIndex++, right.get(rIndex++)); // sets the new element
    }
  }
}
