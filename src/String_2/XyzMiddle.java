package String_2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class XyzMiddle {
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if(len < 5) return str.contains("xyz");

        int half = len / 2;

        String centrStr = len % 2 == 0 ?
                str.substring(half - 2, half + 2) :
                str.substring(half - 1, half + 2);

        return centrStr.contains("xyz");
    }
}
