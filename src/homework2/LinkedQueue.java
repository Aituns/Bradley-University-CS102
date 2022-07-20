/*
Austin Bennett
LinkedQueue.java
Homework 2
THis code implements a queue with linked nodes
*/

package homework2;

import homework2.exceptions.*;

public class LinkedQueue<T> implements QueueADT<T> {
    
    //variables
    private int count;
    private LinearNode<T> head, tail;

    //default construcor tha tsets the count of total nodes to 0 
    //and sets the front and back of the queue to null
    public LinkedQueue() {
        count = 0;
        head = tail = null;
    }

    //adds element to queue
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<T>(element);

        if(isEmpty())
            head = node;
        else
            tail.setNext(node);
        
        //sets the tail to the node
        tail = node;
        count++;
    }

    //removes an element to queue
    public T dequeue() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        //sets the result to head and sets the head to the next
        //element. it also decreases the count by 1
        T result = head.getElement();
        head = head.getNext();
        count--;

        if (isEmpty())
            tail = null;
        
        return result;
    }

    //returns true if the queue is empty
    public boolean isEmpty() {
      return (count == 0);
    }

    //returnns the first element of the queue
    public T first() throws EmptyCollectionException {
      if (isEmpty())
         throw new EmptyCollectionException ("queue"); 

      return head.getElement();
    }

    //returns the size
    public int size() {
      return count;
    }



}