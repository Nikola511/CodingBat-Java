package Map_2;

import java.util.*;

/*
Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
*/

public class WordAppend {
    public static String wordAppend(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strings.length; ++i) {
            String s = strings[i];
            String[] arr = Arrays.copyOfRange(strings, 0, i+1);
            int count = (int)Arrays.stream(arr).filter(x->x.equals(s)).count();
            if(count%2==0) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
