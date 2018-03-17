package Warmup_2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

public class DoubleX {
    static boolean doubleX(String str) {
        return str.matches("^([^x]+)?xx(.+)?$");
    }
}
