import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Hyacinth Room", 500.00, 50);
        guest = new Guest();
    }

    @Test
    public void canGetName(){
        assertEquals("The Hyacinth Room", conferenceRoom.getName());
    }

    @Test
    public void  canGetFee(){
        assertEquals(500, conferenceRoom.getFee(),0.01);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetGuestCount(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void notOverCapacity(){
        for (int i = 0; i<52; i++){
            conferenceRoom.addGuest(guest);
        }
        assertEquals(50, conferenceRoom.getGuestCount());
    }





}
