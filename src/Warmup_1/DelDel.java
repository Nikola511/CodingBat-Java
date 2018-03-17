package Warmup_1;

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/

public class DelDel {
    public static String delDel(String str) {
        return str.replaceAll("^(.)del", "$1");
    }
}
