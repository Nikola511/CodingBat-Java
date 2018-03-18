package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapAB4Test {
    @Test
    void mapAB4Test() {
        System.out.print("Testing mapAB4... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "aaa"); mapIn.put("b", "bb"); mapIn.put("c", "cake");
        mapOut.put("a", "aaa"); mapOut.put("b", "bb"); mapOut.put("c", "aaa");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aa"); mapIn.put("b", "bbb"); mapIn.put("c", "cake");
        mapOut.put("a", "aa"); mapOut.put("b", "bbb"); mapOut.put("c", "bbb");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aa"); mapIn.put("b", "bbb");
        mapOut.put("a", "aa"); mapOut.put("b", "bbb"); mapOut.put("c", "bbb");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa");
        mapOut.put("a", "aaa");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "bbb");
        mapOut.put("b", "bbb");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("b", "bbb"); mapIn.put("c", "cake");
        mapOut.put("a", ""); mapOut.put("b", ""); mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "a"); mapIn.put("b", "b"); mapIn.put("c", "cake");
        mapOut.put("a", ""); mapOut.put("b", ""); mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", ""); mapIn.put("b", "b"); mapIn.put("c", "cake");
        mapOut.put("a", ""); mapOut.put("b", "b"); mapOut.put("c", "b");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "a"); mapIn.put("b", ""); mapIn.put("c", "cake");
        mapOut.put("a", "a"); mapOut.put("b", ""); mapOut.put("c", "a");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("c", "cat"); mapIn.put("d", "dog");
        mapOut.put("c", "cat"); mapOut.put("d", "dog");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("ccc", "ccc");
        mapOut.put("ccc", "ccc");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("c", "a"); mapIn.put("d", "b");
        mapOut.put("c", "a"); mapOut.put("d", "b");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", ""); mapIn.put("z", "z");
        mapOut.put("a", ""); mapOut.put("z", "z");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", ""); mapIn.put("z", "z");
        mapOut.put("b", ""); mapOut.put("z", "z");
        assertEquals(mapOut, MapAB4.mapAB4(mapIn));

        System.out.println("OK");
    }

}