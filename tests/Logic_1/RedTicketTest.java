package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedTicketTest {
    @Test
    void redTicketTest() {
        System.out.print("Testing redTicket... ");

        assertEquals(10, RedTicket.redTicket(2, 2, 2));
        assertEquals(0, RedTicket.redTicket(2, 2, 1));
        assertEquals(5, RedTicket.redTicket(0, 0, 0));
        assertEquals(1, RedTicket.redTicket(2, 0, 0));
        assertEquals(5, RedTicket.redTicket(1, 1, 1));
        assertEquals(0, RedTicket.redTicket(1, 2, 1));
        assertEquals(1, RedTicket.redTicket(1, 2, 0));
        assertEquals(1, RedTicket.redTicket(0, 2, 2));
        assertEquals(1, RedTicket.redTicket(1, 2, 2));
        assertEquals(0, RedTicket.redTicket(0, 2, 0));
        assertEquals(0, RedTicket.redTicket(1, 1, 2));

        System.out.println("OK");
    }
}