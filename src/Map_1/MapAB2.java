package Map_1;

import java.util.*;

/*
Modify and return the given map as follows:
if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
*/

public class MapAB2 {
    public static Map<String, String> mapAB2(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if(a!= null && a.equals(b)) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
