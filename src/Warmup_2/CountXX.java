package Warmup_2;

/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/

public class CountXX {
    static int countXX(String str) {
        int count = 0;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == 'x' && str.charAt(i-1) == 'x') {
                ++count;
            }
        }
        return count;
    }
}
