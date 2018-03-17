package Warmup_2;

/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/

public class StringBits {
    public static String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i += 2)
            sb.append(str.charAt(i));
        return sb.toString();
    }
}
