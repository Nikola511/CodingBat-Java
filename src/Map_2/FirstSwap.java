package Map_2;

import java.util.*;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string
in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap,
so once a char has caused a swap, its later swaps are disabled. Using a map,
this can be solved making just one pass over the array. More difficult than it looks.

firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
*/

public class FirstSwap {
    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> usedChars = new ArrayList<String>();
        for(int i=0; i<strings.length; ++i) {
            String str = strings[i];
            String firstChar = str.substring(0,1);
            if(map.get(firstChar)!=null && usedChars.indexOf(firstChar)==-1) {
                int oldIndex = map.get(firstChar);
                String tempStr = strings[oldIndex];
                strings[oldIndex] = str;
                strings[i] = tempStr;
                usedChars.add(firstChar);
            }
            else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}
