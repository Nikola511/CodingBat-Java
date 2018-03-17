package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {
    @Test
    void altPairsTest() {
        System.out.print("Testing altPairs... ");
        assertEquals("kien", AltPairs.altPairs("kitten"));
        assertEquals("Chole", AltPairs.altPairs("Chocolate"));
        assertEquals("Congrr", AltPairs.altPairs("CodingHorror"));
        assertEquals("ya", AltPairs.altPairs("yak"));
        assertEquals("ya", AltPairs.altPairs("ya"));
        assertEquals("y", AltPairs.altPairs("y"));
        assertEquals("", AltPairs.altPairs(""));
        assertEquals("ThThThth", AltPairs.altPairs("ThisThatTheOther"));
        System.out.println("OK");
    }
}