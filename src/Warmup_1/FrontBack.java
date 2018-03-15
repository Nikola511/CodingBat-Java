package Warmup_1;

public class FrontBack {
    public static String frontBack(String str) {
        if(str.length() < 2) return str;

        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(str.length()-1))
                .append(str.substring(1, str.length()-1))
                .append(str.substring(0,1));

        return sb.toString();
    }
}

/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/