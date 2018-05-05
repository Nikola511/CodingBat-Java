package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class In1To10Test {
    @Test
    void  in1To10Test() {
        System.out.print("Testing in1To10... ");

        assertTrue(In1To10.in1To10(5, false) );
        assertFalse(In1To10.in1To10(11, false) );
        assertTrue(In1To10.in1To10(11, true) );
        assertTrue(In1To10.in1To10(10, false) );
        assertTrue(In1To10.in1To10(10, true) );
        assertTrue(In1To10.in1To10(9, false) );
        assertFalse(In1To10.in1To10(9, true) );
        assertTrue(In1To10.in1To10(1, false) );
        assertTrue(In1To10.in1To10(1, true) );
        assertFalse(In1To10.in1To10(0, false) );
        assertTrue(In1To10.in1To10(0, true) );
        assertFalse(In1To10.in1To10(-1, false) );
        assertTrue(In1To10.in1To10(-1, true) );
        assertFalse(In1To10.in1To10(99, false) );
        assertTrue(In1To10.in1To10(-99, true) );

        System.out.println("OK");
    }
}