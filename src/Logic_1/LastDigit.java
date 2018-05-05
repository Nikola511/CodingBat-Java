package Logic_1;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

class LastDigit {
    static boolean lastDigit(int a, int b, int c) {
        int modA = a % 10, modB = b % 10, modC = c % 10;
        return modA == modB || modA == modC || modB == modC;
    }

}
