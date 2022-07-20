/*
Austin Bennett
TestIntStack.java
Homework 1
this code tests IntStack.java
*/

package homework1.question3;

import homework1.question3.*;

public class TestIntStack {
    public static void main(String[] args) {
        IntStack s = new IntStack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s.peek());
        s.showStack();


    }
}
