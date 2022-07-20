/*
Austin Bennett
EmptyCollectionException.java
Project 1
This code handles empty stack exceptions
*/

package project1.exceptions;

public class EmptyCollectionException extends RuntimeException {
    public EmptyCollectionException (String collection) {
        super ("The " + collection + " is empty.");
    }
}
