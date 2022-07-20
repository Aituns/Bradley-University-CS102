/*
Austin Bennett
CircularArrayQueue.java
Homework 2
This is a queue that's last node point back to the first node*/

package homework2;

import homework2.exceptions.*;

import project1.exceptions.EmptyCollectionException;

public class CircularArrayQueue<T> implements QueueADT<T> {
    //variables
    private final static int DEFAULT_CAPACITY = 100;
    private int front, rear, count;
    private T[] queue;

    //constructor for initial capacity
    public CircularArrayQueue(int initialCapacity) {
        front = rear = count = 0;
        queue = (T[]) (new Object[initialCapacity]);
    }

    //default constructor
    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    //adds an element to the queue
    public void enqueue(T element) {
        if (size() == queue.length)
            expandCapacity();

        queue[rear] = element;
        rear = (rear +1) % queue.length;

        count++;
    }

    //doubles the queue's length
    private void expandCapacity() {
        T[] larger = (T[]) (new Object[queue.length * 2]);

        //copying over the queue
        for (int scan = 0; scan < count; scan++) {
            larger[scan] = queue[front];
            front  = (front + 1) % queue.length;
        }
        
        front = 0;
        rear = count;
        queue = larger;
    }

    //removes an element
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T result = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;

        count--;

        return result;
    }

    //checks if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    //returns the first elemnent of the queue
    public T first() throws EmptyCollectionException {
      if (isEmpty())
         throw new EmptyCollectionException ("queue"); 

      return queue[front];
    }

    //returns size
    public int size() {
      return count;
    }

    
}