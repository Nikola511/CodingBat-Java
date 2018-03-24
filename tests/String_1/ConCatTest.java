package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConCatTest {
    @Test
    void conCatTest() {
        System.out.print("Testing conCat... ");

        assertEquals("abcat", ConCat.conCat("abc", "cat"));
        assertEquals("dogcat", ConCat.conCat("dog", "cat"));
        assertEquals("abc", ConCat.conCat("abc", ""));
        assertEquals("cat", ConCat.conCat("", "cat"));
        assertEquals("pig", ConCat.conCat("pig", "g"));
        assertEquals("pigdoggy", ConCat.conCat("pig", "doggy"));

        System.out.println("OK");
    }

}