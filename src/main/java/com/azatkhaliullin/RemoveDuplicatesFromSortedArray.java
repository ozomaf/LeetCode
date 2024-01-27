package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 26
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[j - 1]) {
                    nums[j] = nums[i];
                    j++;
                }

            }
            System.out.println(Arrays.toString(nums));
            return j;
        }
    }

}