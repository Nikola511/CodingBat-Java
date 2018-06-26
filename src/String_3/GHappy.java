package String_3;

/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */

class GHappy {
    static boolean gHappy(String str) {
        if(str.equals("")) return true;
        if(str.length() == 1) return false;

        for(int i=0; i<str.length(); ++i) {
            if(i==0) {
                if(str.charAt(i)=='g' && str.charAt(i+1)!='g')
                    return false;
            }
            else if (i < str.length()-1) {
                if(str.charAt(i)=='g' && str.charAt(i-1)!='g' && str.charAt(i+1)!='g')
                    return false;
            }
            else {
                if(str.charAt(i)=='g' && str.charAt(i-1)!='g')
                    return false;
            }
        }
        return true;
    }
}
