package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class WordLenTest {
    @Test
    void wordLenTest() {
        System.out.print("Testing wordLen... ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("bb", 2); map.put("a", 1);
        assertEquals(map, WordLen.wordLen(new String[]{"a", "bb", "a", "bb"}));

        map.clear();
        map.put("that", 4); map.put("and", 3); map.put("this", 4);
        assertEquals(map, WordLen.wordLen(new String[]{"this", "and", "that", "and"}));

        map.clear();
        map.put("code", 4); map.put("bug", 3);
        assertEquals(map, WordLen.wordLen(new String[]{"code", "code", "code", "bug"}));

        map.clear();
        assertEquals(map, WordLen.wordLen(new String[]{}));

        map.clear();
        map.put("z", 1);
        assertEquals(map, WordLen.wordLen(new String[]{"z"}));

        System.out.println("OK");
    }

}