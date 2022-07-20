/*
Austin Bennett
ArrayStack.java
Project 1
This code creates an array stack
*/


package project1;

import java.util.Arrays;

import project1.exceptions.*;

public class ArrayStack<T> implements StackADT<T> {
    //Variables
    private static final int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    //Default Contructor
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //Sets the initialCapacity to the user input
    public ArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    //Adds T element to the stack
    public void push(T element) {
        //If the stack is full it expands
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    //doubles the length of the stack
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    //Removes the top object
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        
        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    //Returns the top object
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        
        return stack[top - 1];
        
    }

    //checks if the stack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    //returns size of the stack
    public int size() {
        return top;
    }

    //returns the stack as a string
    public String toString() {
        String result = "";
        if (top > 0) {
            result = result + stack[top-1];
        }
        for (int i = top - 2; i >= 0; i--) {
            result = result + " " + stack[i];
        }
        return result;
    }
}
