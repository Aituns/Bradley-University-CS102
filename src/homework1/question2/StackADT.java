/*
Austin Bennett
StackADT.java
Homework 1
this provides an interface for ArrayStack.java
*/

package homework1.question2;

public interface StackADT<T> {
    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}
