package Warmup_1;

/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

public class StartOz {
    public static String startOz(String str) {
        if(str.length() < 2) {
            if(str.equals("o")) return str;
            return "";
        }

        StringBuilder sb = new StringBuilder();
        if(str.charAt(0)=='o') sb.append("o");
        if(str.charAt(1)=='z') sb.append("z");

        return sb.toString();
    }
}
