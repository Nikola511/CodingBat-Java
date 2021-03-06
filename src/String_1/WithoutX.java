package String_1;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */

public class WithoutX {
    public static String withoutX(String str) {
        return str.replaceAll("(^x|x$)", "");
    }
}
