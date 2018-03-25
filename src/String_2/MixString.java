package String_2;

/*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */

public class MixString {
    public static String mixString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = a.length() <= b.length() ? a.length() : b.length();

        for(int i = 0; i < n; ++i) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        if(a.length() > n) {
            sb.append(a.substring(n));
        }
        else if(b.length() > n) {
            sb.append(b.substring(n));
        }

        return sb.toString();
    }
}
