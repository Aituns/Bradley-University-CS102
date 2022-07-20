/*
Austin Bennett
PostfixToInflixTranslator.java
Project 1
This code changes a Postfix expression to an Inflix expression
*/

package project1;

import project1.ArrayStack;
import java.util.Scanner;

public class PostfixToInfixTranslator {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scan = new Scanner(System.in);

        

        //setup user
        String user;

        //calculate the inflix expression
        //this is assuming no incorrect postfix expressions
        //otherwise there would be checks for insufficient values in expersion
        //and too many values
        do {
            //initialize stack
            ArrayStack inflix = new ArrayStack<>();

            //get postfix expression
            System.out.print("Enter a postfix expression: ");
            String postfix = scan.nextLine();

            //spilt postfix expression to each symbol
            String inputSymbols[] = postfix.split(" "); 

            for (String inputSymbol : inputSymbols) {
                //if operand -> pop the top two and put the operand between them and wrap them in parenthesis
                if (inputSymbol.equals("+") || inputSymbol.equals("-") ||
                    inputSymbol.equals("*") || inputSymbol.equals("/") ) {
                        String a = inflix.pop().toString();
                        String b = inflix.pop().toString();
                        String toPush = ("(" + b + " " + inputSymbol + " " + a + ")");
                        inflix.push(toPush);
                        
                    }
                //if it's a number -> just chuck it on the stack to be used for when theres an operand 
                else {
                    inflix.push(inputSymbol);
                }
            }

            //print out inflix expression
            System.out.print("In inflix notation that is: ");
            System.out.println(inflix.toString());

            //ask if user is done
            System.out.print("Translate another expression [y/n]? ");
            user = scan.nextLine();
            System.out.println();

        } while(user.equalsIgnoreCase("y"));
    }
}