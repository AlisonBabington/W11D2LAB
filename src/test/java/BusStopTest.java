import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop stop;
    Person person;

    @Before
    public void before() {
        stop = new BusStop("Tollcross");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Tollcross", stop.getName());
    }

    @Test
    public void addPerson() {
        stop.addPerson(person);
        assertEquals(1, stop.getQueueLength());
    }

    @Test
    public void removePerson() {
        stop.addPerson(person);
        assertEquals(1, stop.getQueueLength());
        stop.removePerson();
        assertEquals(0,stop.getQueueLength());
    }
}
