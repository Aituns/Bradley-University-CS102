/*
Austin Bennett
ReversCharacters.java
Project 1
This code reverse each word in a string
*/

package project1;

import java.util.Scanner;

public class ReverseCharacters {

    public static void main(String[] args) {
        //setup scanner and result        
        Scanner scan = new Scanner(System.in);
        String result = "";

        //get user input
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();

        //splits the input to an array of words
        String words[] = str.split(" ");

        //setup the linked stack
        LinkedStack ls = new LinkedStack<>();

        //for every word in the input
        for(String word : words) {
            //loops through the word pushing the charAt so the first character is at the bottom of the stack
            for (int i = 0; i < word.length(); i++) {
                ls.push(word.charAt(i));
            }
            //pop each element with the latest one first so that the word is reversed
            for (int i = 0; i < word.length(); i++) {
                result += ls.pop();
            }

            //adds spacing
            result += " ";

        }

        //prints result
        System.out.println("Reversing characters:");
        System.out.println(result);

    }
    
}
