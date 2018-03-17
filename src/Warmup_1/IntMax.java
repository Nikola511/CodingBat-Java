package Warmup_1;

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/

public class IntMax {
    public static int intMax(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}
