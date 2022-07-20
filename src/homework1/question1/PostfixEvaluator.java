/*
Austin Bennett
PostfixEvaluator.java
Homework 1
This code computes postfix expressions
*/

package homework1.question1;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {
    //Variables
    private static final char ADD = '+';
    private static final char SUBTRACT = '-';
    private static final char MULTIPLY = '*';
    private static final char DIVIDE = '/';
    private Stack<Integer> stack = new Stack();

    //main code 
    public int evaluate(String expr) {
        int result = 0;
        Scanner parser = new Scanner(expr);
        //while there's another expression keep running
        while (parser.hasNext()) {
            String token = parser.next();
            //if there's an operator it calculates it using the two 
            //top values and adds them to the stack
            if (this.isOperator(token)) {
                int op2 = this.stack.pop();
                int op1 = this.stack.pop();
                result = this.evaluateSingleOperator(token.charAt(0), op1, op2);
                this.stack.push(new Integer(result));
                continue;
            }
            this.stack.push(new Integer(Integer.parseInt(token)));
        }
        return result;
    }

    //Returns true if the input is a operator
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    //adds, subtracts, multiplies, or divides
    private int evaluateSingleOperator(char operation, int op1, int op2) {
        int result = 0;
        switch (operation) {
            case '+': {
                result = op1 + op2;
                break;
            }
            case '-': {
                result = op1 - op2;
                break;
            }
            case '*': {
                result = op1 * op2;
                break;
            }
            case '/': {
                result = op1 / op2;
            }
        }
        return result;
    }
}
