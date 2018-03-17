package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HasTeenTest {
    @Test
    void hasTeenTest() {
        System.out.print("Testing hasTeen... ");
        assertTrue(HasTeen.hasTeen(13, 20, 10));
        assertTrue(HasTeen.hasTeen(20, 19, 10));
        assertTrue(HasTeen.hasTeen(20, 10, 13));
        assertFalse(HasTeen.hasTeen(1, 20, 12));
        assertTrue(HasTeen.hasTeen(19, 20, 12));
        assertTrue(HasTeen.hasTeen(12, 20, 19));
        assertFalse(HasTeen.hasTeen(12, 9, 20));
        assertTrue(HasTeen.hasTeen(12, 18, 20));
        assertTrue(HasTeen.hasTeen(14, 2, 20));
        assertFalse(HasTeen.hasTeen(4, 2, 20));
        assertFalse(HasTeen.hasTeen(11, 22, 22));
        System.out.println("OK");
    }
}