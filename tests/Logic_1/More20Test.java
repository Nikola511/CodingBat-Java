package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class More20Test {
    @Test
    void more20Test() {
        System.out.print("Testing more20... ");

        assertFalse(More20.more20(20));
        assertTrue(More20.more20(21));
        assertTrue(More20.more20(22));
        assertFalse(More20.more20(23));
        assertFalse(More20.more20(25));
        assertFalse(More20.more20(30));
        assertFalse(More20.more20(31));
        assertFalse(More20.more20(59));
        assertFalse(More20.more20(60));
        assertTrue(More20.more20(61));
        assertTrue(More20.more20(62));
        assertFalse(More20.more20(1020));
        assertTrue(More20.more20(1021));
        assertFalse(More20.more20(1000));
        assertTrue(More20.more20(1001));
        assertFalse(More20.more20(50));
        assertFalse(More20.more20(55));
        assertFalse(More20.more20(40));
        assertTrue(More20.more20(41));
        assertFalse(More20.more20(39));
        assertTrue(More20.more20(42));

        System.out.println("OK");
    }
}