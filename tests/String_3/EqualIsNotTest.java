package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EqualIsNotTest {
    @Test
    void equalIsNotTest() {
        System.out.print("Testing equalIsNot... ");

        assertFalse(EqualIsNot.equalIsNot("This is not"));
        assertTrue(EqualIsNot.equalIsNot("This is notnot"));
        assertTrue(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(EqualIsNot.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(EqualIsNot.equalIsNot("xxxyyyzzzintint"));
        assertTrue(EqualIsNot.equalIsNot(""));
        assertTrue(EqualIsNot.equalIsNot("isisnotnot"));
        assertFalse(EqualIsNot.equalIsNot("isisnotno7Not"));
        assertFalse(EqualIsNot.equalIsNot("isnotis"));
        assertFalse(EqualIsNot.equalIsNot("mis3notpotbotis"));

        System.out.println("OK");
    }
}