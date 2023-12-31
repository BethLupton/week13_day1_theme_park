package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canEnterPlaygroundIfUnder15() {
        assertTrue(playground.isAllowedTo(visitor));


    }

    @Test
    public void canEnterPlaygroundIf15() {
        visitor = new Visitor(15, 1.2, 40.0);
        assertTrue(playground.isAllowedTo(visitor));

    }

    @Test
    public void cannotEnterPlaygroundIfOver15() {
        visitor = new Visitor(16, 1.4, 40.0);
        assertFalse(playground.isAllowedTo(visitor));

    }
}
