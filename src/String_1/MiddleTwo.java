package String_1;

/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

public class MiddleTwo {
    public static String middleTwo(String str) {
        int index = str.length() / 2 - 1;
        return str.substring(index, index + 2);
    }
}
