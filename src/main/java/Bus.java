import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> people;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.people = new ArrayList<>();
    }


    public String getDestination() {
        return destination;
    }

    public int maxCapacity() {
        return capacity;
    }

    public int passengerCount() {
        return people.size();
    }

    public String busFull() {
        return "The bus is full!";
    }

    public void addPassenger(Person person) {
        people.add(person);
    }

    public void removePassenger() {
        people.remove(0);
    }

    public String pickup(BusStop stop) {
        if (passengerCount() < capacity) {
            Person person = stop.removePerson();
            addPassenger(person);
            return "";
        } else {
            return busFull();
        }
    }

    public void pickupAll(BusStop stop) {
        int queuelength = stop.getQueueLength();
        for (int i = 0; i < queuelength; i++) {
            pickup(stop);
        }
    }

}
