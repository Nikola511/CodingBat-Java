package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeaPartyTest {
    @Test
    void teaPartyTest() {
        System.out.print("Testing teaParty... ");

        assertEquals(1, TeaParty.teaParty(6, 8));
        assertEquals(0, TeaParty.teaParty(3, 8));
        assertEquals(2, TeaParty.teaParty(20, 6));
        assertEquals(2, TeaParty.teaParty(12, 6));
        assertEquals(1, TeaParty.teaParty(11, 6));
        assertEquals(0, TeaParty.teaParty(11, 4));
        assertEquals(0, TeaParty.teaParty(4, 5));
        assertEquals(1, TeaParty.teaParty(5, 5));
        assertEquals(1, TeaParty.teaParty(6, 6));
        assertEquals(2, TeaParty.teaParty(5, 10));
        assertEquals(1, TeaParty.teaParty(5, 9));
        assertEquals(0, TeaParty.teaParty(10, 4));
        assertEquals(2, TeaParty.teaParty(10, 20));

        System.out.println("OK");
    }
}