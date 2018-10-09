import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 10);
        person = new Person();
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
}
