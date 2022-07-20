/*
Austin Bennett
TicketCounter.java
Homework 2
This code computes postfix expressions
*/

package homework2;

public class TicketCounter {
    //variables
    private final static int PROCESS = 855; //last 3 of my id
    private final static int MAX_CASHIERS = 10;
    private final static int NUM_CUSTOMERS = 100;

    public static void main(String[] args) {

        //more variables
        Customer customer;
        LinkedQueue<Customer> customerQueue = new LinkedQueue<Customer>();
        int[] cashierTime = new int[MAX_CASHIERS];
        int totalTime, averageTime, departs, start;

        //runs a loop for the time taken for the each number of cashiers 1-10
        for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++) {
            //loop that resets the casheir time
            for (int count = 0; count <= cashiers; count++) {
                cashierTime[count] = 0;
            }

            //queus customers
            for (int count = 1; count <= NUM_CUSTOMERS; count++) {
                customerQueue.enqueue(new Customer(count * 15));
            }
            totalTime = 0;

            //runs through each customer dequeing as it goes
            //it adds up the process time and add it to the total
            while(!(customerQueue.isEmpty())) {
                for (int count = 0; count <= cashiers; count++) {
                    if (!(customerQueue.isEmpty())) {
                        customer = customerQueue.dequeue();
                        if (customer.getArrivalTime() > cashierTime[count]){
                            start = customer.getArrivalTime();
                        } else {
                            start = cashierTime[count];
                        }
                        departs = start + PROCESS;
                        customer.setDepartureTime(departs);
                        cashierTime[count] = departs;
                        totalTime += customer.totalTime();

                    }
                }

            }
            //results
            averageTime = totalTime / NUM_CUSTOMERS;
            System.out.println("Number of cashiers: " + (cashiers + 1));
            System.out.println("average TIme: " + averageTime + "\n");
        }

    }
}
