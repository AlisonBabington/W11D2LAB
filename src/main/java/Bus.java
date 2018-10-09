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


}
