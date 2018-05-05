package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlueTicketTest {
    @Test
    void blueTicketTest() {
        System.out.print("Testing blueTicket... ");

        assertEquals(10, BlueTicket.blueTicket(9, 1, 0));
        assertEquals(0, BlueTicket.blueTicket(9, 2, 0));
        assertEquals(10, BlueTicket.blueTicket(6, 1, 4));
        assertEquals(0, BlueTicket.blueTicket(6, 1, 5));
        assertEquals(10, BlueTicket.blueTicket(10, 0, 0));
        assertEquals(5, BlueTicket.blueTicket(15, 0, 5));
        assertEquals(10, BlueTicket.blueTicket(5, 15, 5));
        assertEquals(5, BlueTicket.blueTicket(4, 11, 1));
        assertEquals(5, BlueTicket.blueTicket(13, 2, 3));
        assertEquals(0, BlueTicket.blueTicket(8, 4, 3));
        assertEquals(10, BlueTicket.blueTicket(8, 4, 2));
        assertEquals(0, BlueTicket.blueTicket(8, 4, 1));

        System.out.println("OK");
    }
}