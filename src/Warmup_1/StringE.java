package Warmup_1;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public class StringE {
    public static boolean stringE(String str) {
        int count = str.replaceAll("[^e]", "").length();
        return count >=1 && count <= 3;
    }
}
