package Logic_2;

/*

Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */

class LoneSum {
    static int loneSum(int a, int b, int c) {
        int sum = 0;
        sum += a == b || a == c ? 0 : a;
        sum += b == a || b == c ? 0 : b;
        sum += c == a || c == b ? 0 : c;
        return sum;
    }
}
