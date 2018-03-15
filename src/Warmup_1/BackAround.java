package Warmup_1;

public class BackAround {
    public static String backAround(String str) {
        StringBuilder sb = new StringBuilder();
        String s = str.substring(str.length()-1);
        sb.append(s)
                .append(str)
                .append(s);

        return sb.toString();
    }
}

/*
Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/