package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreenTicketTest {
    @Test
    void greenTicketTest() {
        System.out.print("Testing greenTicket... ");

        assertEquals(0, GreenTicket.greenTicket(1, 2, 3));
        assertEquals(20, GreenTicket.greenTicket(2, 2, 2));
        assertEquals(10, GreenTicket.greenTicket(1, 1, 2));
        assertEquals(10, GreenTicket.greenTicket(2, 1, 1));
        assertEquals(10, GreenTicket.greenTicket(1, 2, 1));
        assertEquals(0, GreenTicket.greenTicket(3, 2, 1));
        assertEquals(20, GreenTicket.greenTicket(0, 0, 0));
        assertEquals(10, GreenTicket.greenTicket(2, 0, 0));
        assertEquals(0, GreenTicket.greenTicket(0, 9, 10));
        assertEquals(10, GreenTicket.greenTicket(0, 10, 0));
        assertEquals(20, GreenTicket.greenTicket(9, 9, 9));
        assertEquals(10, GreenTicket.greenTicket(9, 0, 9));

        System.out.println("OK");
    }
}