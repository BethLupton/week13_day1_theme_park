package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoaster() {
        Visitor visitor = new Visitor(21, 1.9, 100.0);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideRollercoasterBecauseTooYoung() {
        Visitor visitor = new Visitor(11, 1.9, 100.0);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideRollercoasterBecauseTooShort() {
        Visitor visitor = new Visitor(21, 1.3, 100.0);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideRollercoasterBecauseTooYoungAndTooShort() {
        Visitor visitor = new Visitor(11, 1.3, 100.0);
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }
}
