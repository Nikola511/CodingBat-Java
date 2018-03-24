package String_1;

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class DeFront {
    public static String deFront(String str) {
        StringBuilder sb = new StringBuilder();
        if(str.startsWith("a")) {
            sb.append("a");
        }
        if(str.substring(1, 2).equals("b")) {
            sb.append("b");
        }
        sb.append(str.substring(2));
        return sb.toString();
    }
}
