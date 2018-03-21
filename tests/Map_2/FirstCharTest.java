package Map_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class FirstCharTest {
    @Test
    void firstCharTest() {
        System.out.print("Testing firstChar... ");
        Map<String, String> map = new HashMap<String, String>();

        map.put("s", "saltsoda"); map.put("t", "teatoast");
        assertEquals(map, FirstChar.firstChar(new String[]{"salt", "tea", "soda", "toast"}));

        map.clear();
        map.put("a", "aaaAA"); map.put("b", "bb"); map.put("c", "cccCC"); map.put("d", "d");
        assertEquals(map, FirstChar.firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));

        map.clear();
        assertEquals(map, FirstChar.firstChar(new String[]{}));

        map.clear();
        map.put("a", "appleaardvark"); map.put("b", "bellsbellsbells"); map.put("s", "saltsun"); map.put("z", "zen");
        assertEquals(map, FirstChar.firstChar(new String[]{"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"}));

        System.out.println("OK");
    }
}