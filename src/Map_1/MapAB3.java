package Map_1;

import java.util.*;

/*
Modify and return the given map as follows:
if exactly one of the keys "a" or "b" has a value in the map (but not both),
set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
*/

public class MapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");

        if(a != null && b == null) map.put("b", a);
        else if(a == null && b != null) map.put("a", b);

        return map;
    }
}
