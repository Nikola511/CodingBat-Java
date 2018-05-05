package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CigarPartyTest {
    @Test
    void cigarPartyTest() {
        System.out.print("Testing cigarParty... ");

        assertFalse(CigarParty.cigarParty(30, false));
        assertTrue(CigarParty.cigarParty(50, false));
        assertTrue(CigarParty.cigarParty(70, true));
        assertFalse(CigarParty.cigarParty(30, true));
        assertTrue(CigarParty.cigarParty(50, true));
        assertTrue(CigarParty.cigarParty(60, false));
        assertFalse(CigarParty.cigarParty(61, false));
        assertTrue(CigarParty.cigarParty(40, false));
        assertFalse(CigarParty.cigarParty(39, false));
        assertTrue(CigarParty.cigarParty(40, true));
        assertFalse(CigarParty.cigarParty(39, true));

        System.out.println("OK");
    }
}