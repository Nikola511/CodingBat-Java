package String_2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */

public class RepeatSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        if(count < 1) return "";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count-1; ++i) {
            sb.append(word).append(sep);
        }
        sb.append(word);

        return sb.toString();
    }
}
