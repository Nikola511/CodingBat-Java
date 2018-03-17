package Warmup_2;

/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public class StringX {
    public static String stringX(String str) {
        if(str.length() < 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if(str.startsWith("x")) {
            sb.append("x");
        }
        sb.append(str.replaceAll("x", ""));
        if(str.endsWith("x")) {
            sb.append("x");
        }
        return sb.toString();
    }
}
