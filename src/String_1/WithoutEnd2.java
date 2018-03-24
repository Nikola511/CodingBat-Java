package String_1;

/*
Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */

public class WithoutEnd2 {
    public static String withouEnd2(String str) {
        return str.replaceAll("(^.|.$)", "");
    }
}
