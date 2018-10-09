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

    public void addPassenger(Person person) {
        if (passengerCount() < capacity) {
        people.add(person);
        } return;
    }

    public void removePassenger() {
        people.remove(0);
    }

    public void pickup(BusStop stop) {
        Person person = stop.removePerson();
        addPassenger(person);
    }
}
