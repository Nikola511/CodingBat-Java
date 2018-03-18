package Map_1;

import java.util.*;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
*/

public class MapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
        String value = map.get("a");
        if(value != null) {
            map.put("b", value);
        }

        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
             it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals("c")) it.remove();
        }

        return map;
    }
}
