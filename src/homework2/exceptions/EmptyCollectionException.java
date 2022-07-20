/*
Austin Bennett
EmptyCollectionException.java
Homework 2
This code handles empty stack exceptions
*/



package homework2.exceptions;

public class EmptyCollectionException extends RuntimeException {
    public EmptyCollectionException(String collection) {
        //Prints error to cmd line
        super("The " + collection + " is empty.");
    }
}
