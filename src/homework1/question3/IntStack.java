package homework1.question3;
import java.util.Arrays;
import homework1.exceptions.*;

public class IntStack {
    private final static int DEFAULT_CAPACITY = 7;
    private int stack[];
    private int top=0;

    //option 1
    public IntStack(){
        this (DEFAULT_CAPACITY);
    }

    //option 2
    public IntStack (int initialCapacity){
        top=0;
        stack = new int [initialCapacity];
    }


    public void push (int element)
    {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        ++top;
    }

    public int pop() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        int result;
        --top;
        result = stack[top];
        stack[top]=0;
        return result;
    }

    public int peek() throws EmptyCollectionException{
        if (isEmpty())
            throw new EmptyCollectionException("Stack");

        int result;
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
        for (int n: stack){
            System.out.print(n + " ");
        }
    }

    private void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }
}
