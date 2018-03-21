package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PairsTest {
    @Test
    void pairsTest() {
        System.out.print("Testing pairs... ");
        Map<String, String> map = new HashMap<String, String>();

        map.put("b", "g"); map.put("c", "e");
        assertEquals(map, Pairs.pairs(new String[]{"code", "bug"}));

        map.clear();
        map.put("m", "n");
        assertEquals(map, Pairs.pairs(new String[]{"man", "moon", "main"}));

        map.clear();
        map.put("g", "d"); map.put("m", "n"); map.put("n", "t");
        assertEquals(map, Pairs.pairs(new String[]{"man", "moon", "good", "night"}));

        map.clear();
        assertEquals(map, Pairs.pairs(new String[]{}));

        map.clear();
        map.put("a", "a"); map.put("b", "b");
        assertEquals(map, Pairs.pairs(new String[]{"a", "b"}));

        map.clear();
        map.put("a", "d"); map.put("c", "s");
        assertEquals(map, Pairs.pairs(new String[]{"are", "codes", "and", "cods"}));

        map.clear();
        map.put("a", "e"); map.put("b", "a"); map.put("c", "e"); map.put("t", "a");
        assertEquals(map, Pairs.pairs(new String[]{"apple", "banana", "tea", "coffee"}));

        System.out.println("OK");
    }
}