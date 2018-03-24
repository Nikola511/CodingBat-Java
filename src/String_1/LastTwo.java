package String_1;

/*
Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */

public class LastTwo {
    public static String lastTwo(String str) {
        int len = str.length();
        if(len < 2) return str;
        String end = str.substring(len-1) + str.substring(len-2, len-1);
        return str.substring(0, len - 2) + end;
    }
}
