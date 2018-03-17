package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Last2Test {
    @Test
    void last2Test() {
        System.out.print("Testing last2... ");
        assertEquals(1, Last2.last2("hixxhi"));
        assertEquals(1, Last2.last2("xaxxaxaxx"));
        assertEquals(2, Last2.last2("axxxaaxx"));
        assertEquals(3, Last2.last2("xxaxxaxxaxx"));
        assertEquals(0, Last2.last2("xaxaxaxx"));
        assertEquals(2, Last2.last2("xxxx"));
        assertEquals(1, Last2.last2("13121312"));
        assertEquals(1, Last2.last2("11212"));
        assertEquals(0, Last2.last2("13121311"));
        assertEquals(2, Last2.last2("1717171"));
        assertEquals(0, Last2.last2("hi"));
        assertEquals(0, Last2.last2("h"));
        assertEquals(0, Last2.last2(""));
        System.out.println("OK");
    }
}