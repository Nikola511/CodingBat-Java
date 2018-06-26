package String_3;

/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */

class MirrorEnds {
    static String mirrorEnds(String string) {
        int len = string.length();
        for(int i=len; i>=0; --i) {
            String s = string.substring(0, i);
            if(s.equals(new StringBuilder(string.substring(len-i)).reverse().toString()))
                return s;
        }
        return "";
    }
}
