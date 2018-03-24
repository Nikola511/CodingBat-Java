package String_1;

/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */

public class MiddleThree {
    public static String middleThree(String str) {
        int index = str.length() / 2 - 1;
        return str.substring(index, index + 3);
    }
}
