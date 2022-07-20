/*
Austin Bennett
Customer.java
Homework 2
This is a class for Customer for the TicketCounter.java
*/

package homework2;

public class Customer {
    //variables
    private int arrivalTime, departureTime;

    //constructer that sets arival time
    public Customer(int arrives) {
        arrivalTime = arrives;
        departureTime = 0;
    }

    //returns arrival time
    public int getArrivalTime() {
        return arrivalTime;
    }

    //sets depature time
    public void setDepartureTime(int departs) {
        departureTime = departs;
    }

    //returns departure time
    public int getDepartureTime() {
        return departureTime;
    }

    //returns the total time the Customer spent in the "store"
    public int totalTime() {
        return departureTime - arrivalTime;
    }


}
