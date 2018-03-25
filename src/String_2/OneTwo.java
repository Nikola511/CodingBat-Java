package String_2;

/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
Ignore any group of fewer than 3 chars at the end.

oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */

public class OneTwo {
    public static String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i+=3) {
            if(i <= str.length()-3) {
                sb.append(str.charAt(i+1))
                        .append(str.charAt(i+2))
                        .append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
