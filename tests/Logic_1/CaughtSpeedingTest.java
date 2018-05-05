package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaughtSpeedingTest {
    @Test
    void caughtSpeedingTest() {
        System.out.print("Testing caughtSpeeding... ");

        assertEquals(0, CaughtSpeeding.caughtSpeeding(60, false));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(65, false));
        assertEquals(0, CaughtSpeeding.caughtSpeeding(65, true));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(80, false));
        assertEquals(2, CaughtSpeeding.caughtSpeeding(85, false));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(85, true));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(70, false));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(75, false));
        assertEquals(1, CaughtSpeeding.caughtSpeeding(75, true));
        assertEquals(0, CaughtSpeeding.caughtSpeeding(40, false));
        assertEquals(0, CaughtSpeeding.caughtSpeeding(40, true));
        assertEquals(2, CaughtSpeeding.caughtSpeeding(90, false));

        System.out.println("OK");
    }
}