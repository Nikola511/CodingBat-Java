package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapABTest {
    @Test
    void mapABTest() {
        System.out.print("Testing mapAB... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "Hi"); mapIn.put("b", "There");
        mapOut.put("a", "Hi"); mapOut.put("ab", "HiThere"); mapOut.put("b", "There");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "Hi");
        mapOut.put("a", "Hi");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "There");
        mapOut.put("b", "There");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("c", "meh");
        mapOut.put("c", "meh");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("ab", "nope"); mapIn.put("b", "bbb"); mapIn.put("c", "ccc");
        mapOut.put("a", "aaa"); mapOut.put("ab", "aaabbb"); mapOut.put("b", "bbb"); mapOut.put("c", "ccc");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("ab", "nope"); mapIn.put("b", "bbb"); mapIn.put("c", "ccc");
        mapOut.put("ab", "nope"); mapOut.put("b", "bbb"); mapOut.put("c", "ccc");
        assertEquals(mapOut, MapAB.mapAB(mapIn));

        System.out.println("OK");
    }

}