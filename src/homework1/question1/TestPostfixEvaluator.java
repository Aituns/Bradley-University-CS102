/* 
Austin Bennett
TestPostfixEvaluator.java
Homework 1
This code test PostfixEvaluator.java
*/


package homework1.question1;

import java.util.Scanner;

public class TestPostfixEvaluator {
    public static void main(String[] args) {
        String again;
        Scanner in = new Scanner(System.in);
        do {
            PostfixEvaluator evaluator = new PostfixEvaluator();
            //gets user input
            System.out.println("Enter a valid post-fix expression one token at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
            System.out.println("Each token must be an integer or an operator (+,-,*,/)");
            String expression = in.nextLine();
            
            //calculates
            int result = evaluator.evaluate(expression);
            
            //Asks if user wants to compute another
            System.out.println();
            System.out.println("That expression equals " + result);
            System.out.println("Evaluate another expression [Y/N]? ");
            again = in.nextLine();
            System.out.println();
        } while (again.equalsIgnoreCase("y"));
    }
}
