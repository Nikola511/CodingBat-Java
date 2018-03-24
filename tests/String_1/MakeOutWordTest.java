package String_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakeOutWordTest {
    @Test
    void makeOutWordTest() {
        System.out.print("Testing makeOutWord... ");

        assertEquals("<<Yay>>", MakeOutWord.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", MakeOutWord.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", MakeOutWord.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo", MakeOutWord.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", MakeOutWord.makeOutWord("abyz", "YAY"));

        System.out.println("OK");
    }
}