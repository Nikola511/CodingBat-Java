package String_3;

/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
 */

class MaxBlock {
    static int maxBlock(String str) {
        int len = str.length();
        if(len < 2) return len;

        int maxBlock = 1;
        for(int i = 0; i < len-1; ++i) {
            if(str.charAt(i) == str.charAt(i+1)) {
                int currBlock = 2;
                for(int j = i+1; j < len-1; ++j) {
                    if(str.charAt(j) == str.charAt(j+1)) ++currBlock;
                    else break;
                }
                if(currBlock > maxBlock) maxBlock = currBlock;
            }
        }

        return maxBlock;
    }
}
