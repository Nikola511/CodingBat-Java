package String_2;

/*

Given a string and a non-empty word string, return a string made of each char just before and just
after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */

public class WordEnds {
    public static String wordEnds(String str, String word) {
        int wordLen = word.length(), strLen = str.length();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strLen - wordLen + 1; ++i) {
            int j = i + wordLen;
            if(j <= strLen && str.substring(i, j).equals(word)) {
                if(i == 0 && j < strLen) {
                    sb.append(str.charAt(j));
                }
                else if(i > 0) {
                    if(j == strLen) {
                        sb.append(str.charAt(i - 1));
                    }
                    else {
                        sb.append(str.charAt(i - 1)).append(str.charAt(j));
                    }
                }
            }
        }

        return sb.toString();
    }
}
