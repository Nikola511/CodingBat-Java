package Logic_1;

/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

more20(20) → false
more20(21) → true
more20(22) → true
 */

class More20 {
    static boolean more20(int n) {
        int mod = n % 20;
        return mod == 1 || mod == 2;
    }
}
