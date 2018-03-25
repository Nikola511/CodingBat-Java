package String_2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */

public class EndOther {
    public static boolean endOther(String a, String b) {
        String A = a.toUpperCase();
        String B = b.toUpperCase();

        return A.endsWith(B) || B.endsWith(A);
    }
}