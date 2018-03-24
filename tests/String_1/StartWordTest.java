package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartWordTest {
    @Test
    void startWordTest() {
        System.out.print("Testing startWord... ");

        assertEquals("hi", StartWord.startWord("hippo", "hi"));
        assertEquals("hip", StartWord.startWord("hippo", "xip"));
        assertEquals("h", StartWord.startWord("hippo", "i"));
        assertEquals("", StartWord.startWord("hippo", "ix"));
        assertEquals("", StartWord.startWord("h", "ix"));
        assertEquals("", StartWord.startWord("", "i"));
        assertEquals("hi", StartWord.startWord("hip", "zi"));
        assertEquals("hip", StartWord.startWord("hip", "zip"));
        assertEquals("", StartWord.startWord("hip", "zig"));
        assertEquals("h", StartWord.startWord("h", "z"));
        assertEquals("hippo", StartWord.startWord("hippo", "xippo"));
        assertEquals("", StartWord.startWord("hippo", "xyz"));
        assertEquals("hip", StartWord.startWord("hippo", "hip"));
        assertEquals("kit", StartWord.startWord("kitten", "cit"));
        assertEquals("kit", StartWord.startWord("kit", "cit"));

        System.out.println("OK");
    }
}