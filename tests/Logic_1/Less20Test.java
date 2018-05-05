package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Less20Test {
    @Test
    void less20Test() {
        System.out.print("Testing less20... ");

        assertTrue(Less20.less20(18));
        assertTrue(Less20.less20(19));
        assertFalse(Less20.less20(20));
        assertFalse(Less20.less20(8));
        assertFalse(Less20.less20(17));
        assertFalse(Less20.less20(23));
        assertFalse(Less20.less20(25));
        assertFalse(Less20.less20(30));
        assertFalse(Less20.less20(31));
        assertTrue(Less20.less20(58));
        assertTrue(Less20.less20(59));
        assertFalse(Less20.less20(60));
        assertFalse(Less20.less20(61));
        assertFalse(Less20.less20(62));
        assertFalse(Less20.less20(1017));
        assertTrue(Less20.less20(1018));
        assertTrue(Less20.less20(1019));
        assertFalse(Less20.less20(1020));
        assertFalse(Less20.less20(1021));
        assertFalse(Less20.less20(1022));
        assertFalse(Less20.less20(1023));
        assertFalse(Less20.less20(37));

        System.out.println("OK");
    }
}