package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SleepInTest {
    @Test
    public void BasicTests() {
        System.out.println("***********Basic tests************");
        assertTrue(SleepIn.sleepIn(false, false));
        assertFalse(SleepIn.sleepIn(true, false));
        assertTrue(SleepIn.sleepIn(false, true));
        assertTrue(SleepIn.sleepIn(true, true));
    }
}