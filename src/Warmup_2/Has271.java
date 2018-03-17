package Warmup_2;

/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/

public class Has271 {
    public static boolean has271(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (i+2 <= len - 1){
                int j = Math.abs(nums[i] - 1);
                int k = Math.abs(j - nums[i+2]);
                if(nums[i+1] == nums[i]+5 && k <= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
