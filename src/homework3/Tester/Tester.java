/*
Austin Bennett
Tester.java
Homework3
This code tests the binary and linear seach in SeachCombo.java
*/

package homework3.Tester;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SearchCombo<String> sCombo = new SearchCombo<String>();

        System.out.println("Enter the elements (search pool):");
        String vals = input.nextLine();
        String[] arr = vals.toString().split(" ");
        System.out.println("Target:");
        String target = input.nextLine();
        System.out.println();

        System.out.println("# of Comparisons for Linear Search: " + sCombo.linearSearch(arr, target));
        System.out.println("# of comparisons for Binary Search: " + sCombo.binarySearch(arr, target));

    }
}
