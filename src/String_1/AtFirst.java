package String_1;

/*
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
 */

public class AtFirst {
    public static String atFirst(String str) {
        if("".equals(str)) return "@@";
        return str.length() > 1 ? str.substring(0, 2) : str + "@";
    }
}
