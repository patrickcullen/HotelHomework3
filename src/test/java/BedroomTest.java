import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom("Bedroom1", 100.00, BedroomType.DOUBLE);
        guest = new Guest();
    }

    @Test
    public void canGetName() {
        assertEquals("Bedroom1", bedroom.getName());
    }

    @Test
    public void canGetFee() {
        assertEquals(100.00, bedroom.getFee(),0.01);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetGuestCount() {
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void notOverCapacity() {
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.getGuestCount());
    }
}
