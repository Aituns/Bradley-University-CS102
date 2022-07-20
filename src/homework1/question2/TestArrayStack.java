package homework1.question2;

import homework1.question2.*;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack<>(3);
        s.peek();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.push(4);
        s.push(5);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.toString());
    }
}
