import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop stop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 10);
        person = new Person();
        stop = new BusStop("Tollcross");
    }

    @Test
    public void hasDestination() {
        assertEquals("Ocean Terminal", bus.getDestination());
    }

    @Test
    public void maxCapacity() {
        assertEquals(10, bus.maxCapacity());
    }

    @Test
    public void addPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void fullBus() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(10, bus.passengerCount());
        bus.addPassenger(person);
        assertEquals(10, bus.passengerCount());
        assertEquals("The bus is full!", bus.addPassenger(person));
    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
        bus.removePassenger();
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void pickup() {
        stop.addPerson(person);
        stop.addPerson(person);
        stop.addPerson(person);
        assertEquals(3, stop.getQueueLength());
        bus.pickup(stop);
        assertEquals(2, stop.getQueueLength());
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void pickupAll() {
        stop.addPerson(person);
        stop.addPerson(person);
        stop.addPerson(person);
        stop.addPerson(person);
        stop.addPerson(person);
        assertEquals(5, stop.getQueueLength());
        bus.pickupAll(stop);
        assertEquals(0, stop.getQueueLength());
        assertEquals(5, bus.passengerCount());
    }

//    @Test
//    public void full() {
//        bus.addPassenger(person);
//        bus.addPassenger(person);
//        bus.addPassenger(person);
//    }
}
