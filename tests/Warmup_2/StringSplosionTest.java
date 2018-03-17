package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {
    @Test
    void stringSplosionTest() {
        System.out.print("Testing stringSplosion... ");
        assertEquals("CCoCodCode", StringSplosion.stringSplosion("Code"));
        assertEquals("aababc", StringSplosion.stringSplosion("abc"));
        assertEquals("aab", StringSplosion.stringSplosion("ab"));
        assertEquals("x", StringSplosion.stringSplosion("x"));
        assertEquals("ffafadfade", StringSplosion.stringSplosion("fade"));
        assertEquals("TThTheTherThere", StringSplosion.stringSplosion("There"));
        assertEquals("KKiKitKittKitteKitten", StringSplosion.stringSplosion("Kitten"));
        assertEquals("BByBye", StringSplosion.stringSplosion("Bye"));
        assertEquals("GGoGooGood", StringSplosion.stringSplosion("Good"));
        assertEquals("BBaBad", StringSplosion.stringSplosion("Bad"));
        System.out.println("OK");
    }
}