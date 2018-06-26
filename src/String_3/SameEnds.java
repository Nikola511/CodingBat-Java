package String_3;

/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */

class SameEnds {
    static String sameEnds(String string) {
        int len = string.length();
        for(int i=len/2; i>=0; --i) {
            if(string.substring(0, i).equals(string.substring(len-i)))
                return string.substring(0, i);
        }
        return "";
    }
}
