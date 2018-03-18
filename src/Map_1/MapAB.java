package Map_1;

import java.util.*;

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
*/

public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> map) {
        String valueA = map.get("a");
        String valueB = map.get("b");

        if(valueA != null && valueB != null) {
            map.put("ab", valueA + valueB);
        }
        return map;
    }
}
