package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class WordMultipleTest {
    @Test
    void wordMultipleTest() {
        System.out.print("Testing wordMultiple... ");
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        map.put("a", true); map.put("b", true); map.put("c", false);
        assertEquals(map, WordMultiple.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        map.clear();
        map.put("a", false); map.put("b", false); map.put("c", false);
        assertEquals(map, WordMultiple.wordMultiple(new String[]{"c", "b", "a"}));

        map.clear();
        map.put("c", true);
        assertEquals(map, WordMultiple.wordMultiple(new String[]{"c", "c", "c", "c"}));

        map.clear();
        assertEquals(map, WordMultiple.wordMultiple(new String[]{}));

        map.clear();
        map.put("and", false); map.put("this", true);
        assertEquals(map, WordMultiple.wordMultiple(new String[]{"this", "and", "this"}));

        map.clear();
        map.put("a", true); map.put("b", true); map.put("d", true); map.put("e", false); map.put("x", false); map.put("z", true);
        assertEquals(map, WordMultiple.wordMultiple(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"}));

        System.out.println("OK");
    }
}