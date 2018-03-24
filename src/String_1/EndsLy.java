package String_1;

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */

public class EndsLy {
    public static boolean endsLy(String str) {
        return str.matches("^(.+)?(ly)$");
    }
}

