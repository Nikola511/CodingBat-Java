package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Word0Test {
    @Test
    void word0Test() {
        System.out.print("Testing word0... ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 0); map.put("b", 0);
        assertEquals(map, Word0.word0(new String[]{"a", "b", "a", "b"}));

        map.clear();
        map.put("a", 0); map.put("b", 0); map.put("c", 0);
        assertEquals(map, Word0.word0(new String[]{"a", "b", "a", "c", "b"}));

        map.clear();
        map.put("a", 0); map.put("b", 0); map.put("c", 0);
        assertEquals(map, Word0.word0(new String[]{"c", "b", "a"}));

        map.clear();
        map.put("c", 0);
        assertEquals(map, Word0.word0(new String[]{"c", "c", "c", "c"}));

        map.clear();
        assertEquals(map, Word0.word0(new String[]{}));

        System.out.println("OK");
    }
}