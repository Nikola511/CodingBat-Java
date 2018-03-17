package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoTriplesTest {
    @Test
    void noTriplesTest() {
        System.out.print("Testing noTriples... ");
        assertTrue(NoTriples.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertFalse(NoTriples.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertFalse(NoTriples.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertTrue(NoTriples.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}));
        assertTrue(NoTriples.noTriples(new int[]{1, 2, 1}));
        assertFalse(NoTriples.noTriples(new int[]{1, 1, 1}));
        assertTrue(NoTriples.noTriples(new int[]{1, 1}));
        assertTrue(NoTriples.noTriples(new int[]{1}));
        assertTrue(NoTriples.noTriples(new int[]{}));
        System.out.println("OK");
    }
}