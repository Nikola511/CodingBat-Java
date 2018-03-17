package Warmup_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Close10Test {
    @Test
    void close10Test() {
        System.out.print("Testing close10... ");
        assertEquals(8, Close10.close10(8, 13));
        assertEquals(8, Close10.close10(13, 8));
        assertEquals(0, Close10.close10(13, 7));
        assertEquals(0, Close10.close10(7, 13));
        assertEquals(9, Close10.close10(9, 13));
        assertEquals(8, Close10.close10(13, 8));
        assertEquals(10, Close10.close10(10, 12));
        assertEquals(10, Close10.close10(11, 10));
        assertEquals(5, Close10.close10(5, 21));
        assertEquals(0, Close10.close10(0, 20));
        assertEquals(0, Close10.close10(10, 10));
        System.out.println("OK");
    }
}