package homework1.question4;

public class TestDoubleStack {
    public static void main(String[] args) {
        DoubleStack s = new DoubleStack(3);
        s.push(1.2);
        s.push(2.3);
        s.push(3.4);
        System.out.println(s.peek());
        s.push(4.5);
        s.push(5.6);
        s.pop();
        System.out.println(s.peek());
        s.showStack();
    }
}