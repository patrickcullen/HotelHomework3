import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("The Dorchester");
    }

    @Test
    public void canGetName(){
        assertEquals("The Dorchester", hotel.getName());
    }

}
