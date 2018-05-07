import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom("The Carnivore Carvery", 0, 75);
        guest = new Guest();
    }

    @Test
    public void canGetName(){
        assertEquals("The Carnivore Carvery", diningRoom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(75, diningRoom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void notOverCapacity(){
        for (int i = 0; i<77; i++){
            diningRoom.addGuest(guest);
        }
        assertEquals(75, diningRoom.getGuestCount());
    }

}
