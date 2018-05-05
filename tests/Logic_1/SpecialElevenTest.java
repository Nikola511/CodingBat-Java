package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialElevenTest {
    @Test
    void specialElevenTest() {
        System.out.print("Testing specialEleven... ");

        assertTrue(SpecialEleven.specialEleven(22) );
        assertTrue(SpecialEleven.specialEleven(23) );
        assertFalse(SpecialEleven.specialEleven(24) );
        assertFalse(SpecialEleven.specialEleven(21) );
        assertTrue(SpecialEleven.specialEleven(11) );
        assertTrue(SpecialEleven.specialEleven(12) );
        assertFalse(SpecialEleven.specialEleven(10) );
        assertFalse(SpecialEleven.specialEleven(9) );
        assertFalse(SpecialEleven.specialEleven(8) );
        assertTrue(SpecialEleven.specialEleven(0) );
        assertTrue(SpecialEleven.specialEleven(1) );
        assertFalse(SpecialEleven.specialEleven(2) );
        assertTrue(SpecialEleven.specialEleven(121) );
        assertTrue(SpecialEleven.specialEleven(122) );
        assertFalse(SpecialEleven.specialEleven(123) );
        assertFalse(SpecialEleven.specialEleven(46) );
        assertFalse(SpecialEleven.specialEleven(49) );
        assertFalse(SpecialEleven.specialEleven(52) );
        assertFalse(SpecialEleven.specialEleven(54) );
        assertTrue(SpecialEleven.specialEleven(55) );

        System.out.println("OK");
    }
}