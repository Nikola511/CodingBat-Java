package Logic_1;

/*
Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5, then the return the smaller value.
However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes
the remainder, e.g. 7 % 5 is 2.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */

class MaxMod5 {
    static int maxMod5(int a, int b) {
        if(a == b) return 0;
        int max = a > b ? a : b, min = a < b ? a : b;
        if(max % 5 == min % 5) return min;
        return max;
    }
}
