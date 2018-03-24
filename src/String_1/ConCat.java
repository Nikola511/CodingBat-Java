package String_1;

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */

public class ConCat {
    public static String conCat(String a, String b) {
        if(a.equals("")) return b;
        if(b.equals("")) return a;
        if(a.substring(a.length() - 1).equals(b.substring(0, 1)))
            b = b.substring(1);
        return a + b;
    }
}
