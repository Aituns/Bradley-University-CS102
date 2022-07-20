/*
Austin Bennett
SearchCombo.java
Homework3
this code contains the linearSearch and binarySearch methods
*/

package homework3.SearchCombo;

public class SearchCombo<T extends Comparable<T>> {

    // code for linear search
    public int linearSearch(T[] array, T target) {
        int comparisons = 0;
        int index = 0;
        boolean found = false;
        while (!found && index <= array.length - 1) {
            found = array[index].equals(target);
            index++;
            comparisons++;
            // checking for not found
            if (comparisons == array.length) {
                System.out.println("Not found!");
                return comparisons;
            }
        }
        return comparisons;
    }

    // binary search
    public int binarySearch(T[] arr, T target) {
        int low = 0;
        int high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            // checking if it has been found other wise making a new section to check
            if (target.compareTo(arr[mid]) == 0) {
                comparisons++;
                return comparisons;
            } else if (target.compareTo(arr[mid]) < 0) {
                comparisons++;
                high = mid - 1;
            } else {
                comparisons++;
                low = mid + 1;
            }
        }
        System.out.println("Not found!");
        return comparisons;

    }
}
