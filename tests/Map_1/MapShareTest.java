package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MapShareTest {
    @Test
    void mapShareTest() {
        System.out.print("Testing mapShare... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("a", "aaa"); mapIn.put("b", "bbb"); mapIn.put("c", "ccc");
        mapOut.put("a", "aaa"); mapOut.put("b", "aaa");
        assertEquals(mapOut, MapShare.mapShare(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("b", "xyz"); mapIn.put("c", "ccc");
        mapOut.put("b", "xyz");
        assertEquals(mapOut, MapShare.mapShare(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "aaa"); mapIn.put("c", "meh"); mapIn.put("d", "hi");
        mapOut.put("a", "aaa"); mapOut.put("b", "aaa"); mapOut.put("d", "hi");
        assertEquals(mapOut, MapShare.mapShare(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "xyz"); mapIn.put("b", "1234"); mapIn.put("c", "yo"); mapIn.put("z", "zzz");
        mapOut.put("a", "xyz"); mapOut.put("b", "xyz"); mapOut.put("z", "zzz");
        assertEquals(mapOut, MapShare.mapShare(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("a", "xyz"); mapIn.put("b", "1234"); mapIn.put("c", "yo"); mapIn.put("d", "ddd"); mapIn.put("e", "everything");
        mapOut.put("a", "xyz"); mapOut.put("b", "xyz"); mapOut.put("d", "ddd"); mapOut.put("e", "everything");
        assertEquals(mapOut, MapShare.mapShare(mapIn));

        System.out.println("OK");
    }
}