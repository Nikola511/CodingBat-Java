package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NearHundredTest {
    @Test
    void nearHundredTest() {
        System.out.print("Testing nearHundred... ");
        assertTrue(NearHundred.nearHundred(93));
        assertTrue(NearHundred.nearHundred(90));
        assertFalse(NearHundred.nearHundred(89));
        assertTrue(NearHundred.nearHundred(110));
        assertFalse(NearHundred.nearHundred(111));
        assertFalse(NearHundred.nearHundred(121));
        assertFalse(NearHundred.nearHundred(-101));
        assertFalse(NearHundred.nearHundred(-209));
        assertTrue(NearHundred.nearHundred(190));
        assertTrue(NearHundred.nearHundred(209));
        assertFalse(NearHundred.nearHundred(0));
        assertFalse(NearHundred.nearHundred(5));
        assertFalse(NearHundred.nearHundred(-50));
        assertTrue(NearHundred.nearHundred(191));
        assertFalse(NearHundred.nearHundred(189));
        assertTrue(NearHundred.nearHundred(200));
        assertTrue(NearHundred.nearHundred(210));
        assertFalse(NearHundred.nearHundred(211));
        assertFalse(NearHundred.nearHundred(290));
        System.out.println("OK");
    }
}