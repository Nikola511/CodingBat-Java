package Map_2;

import org.junit.jupiter.api.Test;

class AllSwapTest {
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
    void allSwapTest() {
        System.out.print("Testing allSwap... ");

        isEqual(new String[]{"ac", "ab"}, AllSwap.allSwap(new String[]{"ab", "ac"}));
        isEqual(new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}, AllSwap.allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));
        isEqual(new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}, AllSwap.allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
        isEqual(new String[]{"ay", "bx", "cy", "ax", "cx", "abb", "aaa"}, AllSwap.allSwap(new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}));
        isEqual(new String[]{"every", "does", "ice", "easy", "it", "eaten"}, AllSwap.allSwap(new String[]{"easy", "does", "it", "every", "ice", "eaten"}));
        isEqual(new String[]{"lily", "over", "water", "swims", "of", "list", "words", "wait"}, AllSwap.allSwap(new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"}));
        isEqual(new String[]{"42", "8", "16", "15", "23", "4"}, AllSwap.allSwap(new String[]{"4", "8", "15", "16", "23", "42"}));
        isEqual(new String[]{"aaa"}, AllSwap.allSwap(new String[]{"aaa"}));
        isEqual(new String[]{}, AllSwap.allSwap(new String[]{}));
        isEqual(new String[]{"a", "b", "c", "xx", "yy", "zz"}, AllSwap.allSwap(new String[]{"a", "b", "c", "xx", "yy", "zz"}));

        System.out.println("OK");
    }
}