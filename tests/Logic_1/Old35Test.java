package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Old35Test {
    @Test
    void old35Test() {
        System.out.print("Testing old35... ");

        assertTrue(Old35.old35(3));
        assertTrue(Old35.old35(10));
        assertFalse(Old35.old35(15));
        assertTrue(Old35.old35(5));
        assertTrue(Old35.old35(9));
        assertFalse(Old35.old35(8));
        assertFalse(Old35.old35(7));
        assertTrue(Old35.old35(6));
        assertFalse(Old35.old35(17));
        assertTrue(Old35.old35(18));
        assertFalse(Old35.old35(29));
        assertTrue(Old35.old35(20));
        assertTrue(Old35.old35(21));
        assertFalse(Old35.old35(22));
        assertFalse(Old35.old35(45));
        assertTrue(Old35.old35(99));

        System.out.println("OK");
    }
}