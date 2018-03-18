package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapBullyTest {
    @Test
    void mapBullyTest() {
        System.out.print("Testing mapBully... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "candy");  mapIn.put("b", "dirt");
        mapOut.put("a", "");      mapOut.put("b", "candy");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "candy");
        mapOut.put("a", "");      mapOut.put("b", "candy");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "candy"); mapIn.put("b", "carrot"); mapIn.put("c", "meh");
        mapOut.put("a", "");     mapOut.put("b", "candy"); mapOut.put("c", "meh");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "carrot");
        mapOut.put("b", "carrot");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("c", "meh");
        mapOut.put("c", "meh");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "sparkle"); mapIn.put("c", "meh");
        mapOut.put("a", ""); mapOut.put("b", "sparkle"); mapOut.put("c", "meh");
        assertEquals(mapOut, MapBully.mapBully(mapIn));

        System.out.println("OK");
    }
}