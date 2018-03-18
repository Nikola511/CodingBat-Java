package Map_1;

import java.util.*;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
then set "c" to have the longer value. If the values exist and have the same length,
change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
*/

public class MapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {
        String a = map.get("a"), b = map.get("b");
        if(a != null && b != null) {
            int len1 = a.length(), len2 = b.length();
            if(len1 > len2) {
                map.put("c", a);
            }
            else if(len1 < len2) {
                map.put("c", b);
            }
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
