package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountHiTest {
    @Test
    void countHiTest() {
        System.out.print("Testing countHi... ");

        assertEquals(1, CountHi.countHi("abc hi ho"));
        assertEquals(2, CountHi.countHi("ABChi hi"));
        assertEquals(2, CountHi.countHi("hihi"));
        assertEquals(2, CountHi.countHi("hiHIhi"));
        assertEquals(0, CountHi.countHi(""));
        assertEquals(0, CountHi.countHi("h"));
        assertEquals(1, CountHi.countHi("hi"));
        assertEquals(0, CountHi.countHi("Hi is no HI on ahI"));
        assertEquals(2, CountHi.countHi("hiho not HOHIhi"));

        System.out.println("OK");
    }
}