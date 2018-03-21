package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class WordCountTest {
    @Test
    void wordCountTest() {
        System.out.print("Testing wordCount... ");
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 2); map.put("b", 2); map.put("c", 1);
        assertEquals(map, WordCount.wordCount(new String[]{"a", "b", "a", "c", "b"}));

        map.clear();
        map.put("a", 1); map.put("b", 1); map.put("c", 1);
        assertEquals(map, WordCount.wordCount(new String[]{"c", "b", "a"}));

        map.clear();
        map.put("c", 4);
        assertEquals(map, WordCount.wordCount(new String[]{"c", "c", "c", "c"}));

        map.clear();
        assertEquals(map, WordCount.wordCount(new String[]{}));

        map.clear();
        map.put("", 1); map.put("and", 1); map.put("this", 2);
        assertEquals(map, WordCount.wordCount(new String[]{"this", "and", "this", ""}));

        map.clear();
        map.put("x", 2); map.put("X", 1); map.put("y", 1); map.put("Y", 1);
        assertEquals(map, WordCount.wordCount(new String[]{"x", "y", "x", "Y", "X"}));

        map.clear();
        map.put("0", 1); map.put("1", 1); map.put("123", 2);
        assertEquals(map, WordCount.wordCount(new String[]{"123", "0", "123", "1"}));

        map.clear();
        map.put("a", 4); map.put("b", 5); map.put("d", 3); map.put("e", 1); map.put("f", 1); map.put("one", 1); map.put("x", 2); map.put("z", 2); map.put("two", 2);
        assertEquals(map, WordCount.wordCount(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"}));

        map.clear();
        map.put("banana", 2); map.put("apple", 3); map.put("tea", 1); map.put("coffee", 1);
        assertEquals(map, WordCount.wordCount(new String[]{"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}));

        System.out.println("OK");
    }
}