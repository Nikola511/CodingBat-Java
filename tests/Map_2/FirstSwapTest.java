package Map_2;

import org.junit.jupiter.api.Test;

class FirstSwapTest {
    boolean isEqual(String[] arr1, String[] arr2) {
        if(arr1.length==0 || arr2.length==0) return false;
        if(arr1.length != arr2.length) return false;
        for(int i=0; i<arr1.length; ++i) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    @Test
    void firstSwapTest() {
        System.out.print("Testing firstSwap... ");

        isEqual(new String[]{}, FirstSwap.firstSwap(new String[]{"ab", "ac"}));
        isEqual(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}, FirstSwap.firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        isEqual(new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}, FirstSwap.firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
        isEqual(new String[]{"ay", "bx", "cy", "ax", "cx", "aaa", "abb"}, FirstSwap.firstSwap(new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}));
        isEqual(new String[]{"every", "does", "ice", "easy", "it", "eaten"}, FirstSwap.firstSwap(new String[]{"easy", "does", "it", "every", "ice", "eaten"}));
        isEqual(new String[]{"lily", "over", "water", "swims", "of", "list", "words", "wait"}, FirstSwap.firstSwap(new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"}));
        isEqual(new String[]{"42", "8", "16", "15", "23", "4"}, FirstSwap.firstSwap(new String[]{"4", "8", "15", "16", "23", "42"}));
        isEqual(new String[]{"aaa"}, FirstSwap.firstSwap(new String[]{"aaa"}));
        isEqual(new String[]{}, FirstSwap.firstSwap(new String[]{}));
        isEqual(new String[]{"a", "b", "c", "xx", "yy", "zz"}, FirstSwap.firstSwap(new String[]{"a", "b", "c", "xx", "yy", "zz"}));

        System.out.println("OK");
    }

}