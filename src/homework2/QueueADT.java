/*
Austin Bennett
QueueADT.java
Homework 2
This code provides and interface for CircularArrayQueue and LinkedQueue
*/

package homework2;

public interface QueueADT<T> {
    
    public void enqueue (T element);

    public T dequeue();

    public T first();

    public boolean isEmpty();

    public int size();

    public String toString();
}