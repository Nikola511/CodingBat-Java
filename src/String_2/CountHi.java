package String_2;

import java.util.regex.*;

/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */

public class CountHi {
    public static int countHi(String str) {
        Pattern pattern = Pattern.compile("hi");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            ++count;
        }
        return count;
    }

    /*
    Paste solution:
    int count = 0;
    for (int i=0; i < str.length()-1; i++) {
    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
      count++;
    }
    return count;
    */
}
