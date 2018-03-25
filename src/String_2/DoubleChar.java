package String_2;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

public class DoubleChar {
    public static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("");
        for(String s : arr) {
            sb.append(s + s);
        }
        return sb.toString();
    }
}
