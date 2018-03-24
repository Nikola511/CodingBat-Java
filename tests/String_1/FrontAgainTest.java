package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrontAgainTest {
    @Test
    void frontAgainTest() {
        System.out.print("Testing frontAgain... ");

        assertTrue(FrontAgain.frontAgain("edited"));
        assertFalse(FrontAgain.frontAgain("edit"));
        assertTrue(FrontAgain.frontAgain("ed"));
        assertTrue(FrontAgain.frontAgain("jj"));
        assertTrue(FrontAgain.frontAgain("jjj"));
        assertTrue(FrontAgain.frontAgain("jjjj"));
        assertFalse(FrontAgain.frontAgain("jjjk"));
        assertFalse(FrontAgain.frontAgain("x"));
        assertFalse(FrontAgain.frontAgain(""));
        assertFalse(FrontAgain.frontAgain("java"));
        assertTrue(FrontAgain.frontAgain("javaja"));

        System.out.println("OK");
    }
}