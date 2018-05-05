package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquirrelPlayTest {
    @Test
    void squirrelPlayTest() {
        System.out.print("Testing squirrelPlay... ");

        assertTrue(SquirrelPlay.squirrelPlay(70, false) );
        assertFalse(SquirrelPlay.squirrelPlay(95, false) );
        assertTrue(SquirrelPlay.squirrelPlay(95, true) );
        assertTrue(SquirrelPlay.squirrelPlay(90, false) );
        assertTrue(SquirrelPlay.squirrelPlay(90, true) );
        assertFalse(SquirrelPlay.squirrelPlay(50, false) );
        assertFalse(SquirrelPlay.squirrelPlay(50, true) );
        assertFalse(SquirrelPlay.squirrelPlay(100, false) );
        assertTrue(SquirrelPlay.squirrelPlay(100, true) );
        assertFalse(SquirrelPlay.squirrelPlay(105, true) );
        assertFalse(SquirrelPlay.squirrelPlay(59, false) );
        assertFalse(SquirrelPlay.squirrelPlay(59, true) );
        assertTrue(SquirrelPlay.squirrelPlay(60, false) );

        System.out.println("OK");
    }
}