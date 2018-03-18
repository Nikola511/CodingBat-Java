package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapAB2Test {
    @Test
    void mapAB2Test() {
        System.out.print("Testing mapAB2... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "aaa"); mapIn.put("b", "aaa"); mapIn.put("c", "cake");
        mapOut.put("c", "cake");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("b", "bbb");
        mapOut.put("a", "aaa"); mapOut.put("b", "bbb");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("b", "bbb"); mapIn.put("c", "aaa");
        mapOut.put("a", "aaa"); mapOut.put("b", "bbb"); mapOut.put("c", "aaa");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa");
        mapOut.put("a", "aaa");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "bbb");
        mapOut.put("b", "bbb");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", ""); mapIn.put("b", ""); mapIn.put("c", "ccc");
        mapOut.put("c", "ccc");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "a"); mapIn.put("b", "b"); mapIn.put("z", "zebra");
        mapOut.put("a", "a"); mapOut.put("b", "b"); mapOut.put("z", "zebra");
        assertEquals(mapOut, MapAB2.mapAB2(mapIn));

        System.out.println("OK");
    }
}