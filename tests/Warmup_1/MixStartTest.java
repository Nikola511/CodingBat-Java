package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MixStartTest {
    @Test
    void mixStartTest() {
        System.out.print("Testing mixStart... ");
        assertTrue(MixStart.mixStart("mix snacks"));
        assertTrue(MixStart.mixStart("pix snacks"));
        assertFalse(MixStart.mixStart("piz snacks"));
        assertTrue(MixStart.mixStart("nix"));
        assertFalse(MixStart.mixStart("ni"));
        assertFalse(MixStart.mixStart("n"));
        assertFalse(MixStart.mixStart(""));
        System.out.println("OK");
    }
}