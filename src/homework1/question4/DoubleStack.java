package homework1.question4;

import java.util.Arrays;
import homework1.exceptions.*;

public class DoubleStack {
    private final static int DEFAULT_CAPACITY = 7;
    private double stack[];
    private int top=0;

    //option 1
    public DoubleStack(){
        this (DEFAULT_CAPACITY);
    }

    //option 2
    public DoubleStack (int initialCapacity){
        top=0;
        stack = new double [initialCapacity];
    }


    public void push (double element)
    {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        ++top;
    }

    public double pop() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        double result;
        --top;
        result = stack[top];
        stack[top]=0;
        return result;
    }

    public double peek() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        double result;
        result=stack[top-1];
        return result;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top ==0;
    }

    //print out the Stack
    public void showStack(){
        for (double n: stack){
            System.out.print(n + " ");
        }
    }

    private void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }
}
