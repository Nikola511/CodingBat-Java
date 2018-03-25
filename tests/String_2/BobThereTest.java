package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BobThereTest {
    @Test
    void bobThereTest() {
        System.out.print("Testing bobThere... ");

        assertTrue(BobThere.bobThere("abcbob"));
        assertTrue(BobThere.bobThere("b9b"));
        assertFalse(BobThere.bobThere("bac"));
        assertTrue(BobThere.bobThere("bbb"));
        assertFalse(BobThere.bobThere("abcdefb"));
        assertTrue(BobThere.bobThere("123abcbcdbabxyz"));
        assertFalse(BobThere.bobThere("b12"));
        assertTrue(BobThere.bobThere("b1b"));
        assertTrue(BobThere.bobThere("b12b1b"));
        assertFalse(BobThere.bobThere("bbc"));
        assertTrue(BobThere.bobThere("bbb"));
        assertFalse(BobThere.bobThere("bb"));
        assertFalse(BobThere.bobThere("b"));

        System.out.println("OK");
    }
}