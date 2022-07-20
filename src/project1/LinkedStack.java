/*
Austin Bennett
LinkedStack.java
Project 1
This code is a linked stack
*/

package project1;
import project1.exceptions.*;

public class LinkedStack<T> implements StackADT<T> {
    private int count;
    private LinearNode<T> top;

    //default contructor
    public LinkedStack() {
        count = 0;
        top = null;
    }

    //pushes new element
    public void push(T element) {
        LinearNode<T> temp = new LinearNode<T>(element);
        
        temp.setNext(top);
        top = temp;
        count++;
    }
    
    //removes element
    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        
        T result = top.getElement();
        top = top.getNext();
        count--;

        return result;
    }

    //returns top element
    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");
        
        return top.getElement();
    }

    //returns size
    public int size() {
        return count;
    }

    //returns if empty
    public boolean isEmpty() {
        return top == null;
    }


    //prints the LinkedStack as string
    public String toString() {
        LinearNode<T> temp = top;
        String result = "";
        while(temp != null) {
            result = result + temp.getElement() + " ";
            temp = temp.getNext();
        }

        return result;
    }


}
