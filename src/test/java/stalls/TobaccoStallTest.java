package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyFromTobaccoStallIfOver18() {
        visitor = new Visitor(21, 1.9, 100.0);
        assertTrue(tobaccoStall.isAllowedTo(visitor));


    }

    @Test
    public void canBuyFromTobaccoStallIf18() {
        visitor = new Visitor(18, 1.2, 40.0);
        assertTrue(tobaccoStall.isAllowedTo(visitor));

    }
    @Test
    public void canBuyFromTobaccoStallIfUnder18() {
        visitor = new Visitor(16, 1.4, 40.0);
        assertFalse(tobaccoStall.isAllowedTo(visitor));

    }
}

