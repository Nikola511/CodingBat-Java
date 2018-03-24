package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtraEndTest {
    @Test
    void extraEndTest() {
        System.out.print("Testing extraEnd... ");

        assertEquals("lololo", ExtraEnd.extraEnd("Hello"));
        assertEquals("ababab", ExtraEnd.extraEnd("ab"));
        assertEquals("HiHiHi", ExtraEnd.extraEnd("Hi"));
        assertEquals("dydydy", ExtraEnd.extraEnd("Candy"));
        assertEquals("dedede", ExtraEnd.extraEnd("Code"));

        System.out.println("OK");
    }
}