package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapAB3Test {
    @Test
    void mapAB3Test() {
        System.out.print("Testing mapAB3... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "aaa"); mapIn.put("c", "cake");
        mapOut.put("a", "aaa"); mapOut.put("b", "aaa"); mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "bbb"); mapIn.put("c", "cake");
        mapOut.put("a", "bbb"); mapOut.put("b", "bbb"); mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("b", "bbb"); mapIn.put("c", "cake");
        mapOut.put("a", "aaa"); mapOut.put("b", "bbb"); mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("ccc", "ccc");
        mapOut.put("ccc", "ccc");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("c", "a"); mapIn.put("d", "b");
        mapOut.put("c", "a"); mapOut.put("d", "b");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "");
        mapOut.put("a", ""); mapOut.put("b", "");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "");
        mapOut.put("a", ""); mapOut.put("b", "");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", ""); mapIn.put("b", "");
        mapOut.put("a", ""); mapOut.put("b", "");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("aa", "aa"); mapIn.put("a", "apple"); mapIn.put("z", "zzz");
        mapOut.put("aa", "aa"); mapOut.put("a", "apple"); mapOut.put("b", "apple"); mapOut.put("z", "zzz");
        assertEquals(mapOut, MapAB3.mapAB3(mapIn));

        System.out.println("OK");
    }

}