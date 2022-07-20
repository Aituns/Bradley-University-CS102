/*
Austin Bennett
Codes.java
Homework 2
an implementation of the ceaser cypher
*/

package homework2;

public class Codes {
    public static void main(String[] args) {

        //variables
        int[] key  = {5, 12, -3, 8, -9, 4, 10};
        Integer keyValue;
        String encoded = "", decoded = "";

        //original message
        String message = "All programmers are playwrights and all computers are lousy actors";
        
        CircularArrayQueue<Integer> encodingQueue = new CircularArrayQueue<Integer>();
        CircularArrayQueue<Integer> decodingQueue = new CircularArrayQueue<Integer>();

        //start key queue
        for (int scan = 0; scan < key.length; scan++) {
            encodingQueue.enqueue(key[scan]);
            decodingQueue.enqueue(key[scan]);
        }

        //encode
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = encodingQueue.dequeue();
            encoded += (char) (message.charAt(scan) + keyValue);
            encodingQueue.enqueue(keyValue);
        }

        //print out encoded message
        System.out.println("Encoded Message:\n" + encoded + "\n");

        //decode
        for (int scan = 0; scan < encoded.length(); scan ++) {
            keyValue = decodingQueue.dequeue();
            decoded += (char) (encoded.charAt(scan) - keyValue);
            decodingQueue.enqueue(keyValue);
        }

        //print out decoded message
        System.out.println("Encoded Message:\n" + decoded + "\n");
    }
}
