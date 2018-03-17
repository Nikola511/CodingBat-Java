package Warmup_2;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public class AltPairs {
    public static String altPairs(String str) {
        if(str.length() < 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i += 4) {
            if(i == str.length()-1) {
                sb.append(str.substring(i));
            }
            else {
                sb.append(str.substring(i, i+2));
            }
        }
        return sb.toString();
    }
}
