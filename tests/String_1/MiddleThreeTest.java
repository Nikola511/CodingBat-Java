package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiddleThreeTest {
    @Test
    void middleThreeTest() {
        System.out.print("Testing middleThree... ");

        assertEquals("and", MiddleThree.middleThree("Candy"));
        assertEquals("and", MiddleThree.middleThree("and"));
        assertEquals("lvi", MiddleThree.middleThree("solving"));
        assertEquals("yet", MiddleThree.middleThree("Hi yet Hi"));
        assertEquals("yet", MiddleThree.middleThree("java yet java"));
        assertEquals("col", MiddleThree.middleThree("Chocolate"));
        assertEquals("xyz", MiddleThree.middleThree("XabcxyzabcX"));

        System.out.println("OK");
    }
}