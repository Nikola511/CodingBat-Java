package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class In3050Test {
    @Test
    void in3050Test() {
        System.out.print("Testing in3050... ");
        assertTrue(In3050.in3050(30, 31));
        assertFalse(In3050.in3050(30, 41));
        assertTrue(In3050.in3050(40, 50));
        assertFalse(In3050.in3050(40, 51));
        assertFalse(In3050.in3050(39, 50));
        assertFalse(In3050.in3050(50, 39));
        assertTrue(In3050.in3050(40, 39));
        assertTrue(In3050.in3050(49, 48));
        assertTrue(In3050.in3050(50, 40));
        assertFalse(In3050.in3050(50, 51));
        assertTrue(In3050.in3050(35, 36));
        assertFalse(In3050.in3050(35, 45));
        System.out.println("OK");
    }
}