package Map_2;

import java.util.*;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
*/

public class FirstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for(String s : strings) {
            String first = s.substring(0,1);
            if(map.get(first)==null) {
                StringBuilder sb = new StringBuilder();
                for(String s1 : strings) {
                    if(s1.startsWith(first)) {
                        sb.append(s1);
                    }
                }
                map.put(first, sb.toString());
            }
        }

        return map;
    }
}
