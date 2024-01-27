package com.azatkhaliullin;

/**
 * 747
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 6, 1, 0};
        System.out.println(solution.dominantIndex(nums));

    }

    static class Solution {
        public int dominantIndex(int[] nums) {
            int max = 0;
            int indexOfMax = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                    indexOfMax = i;
                }

            }
            for (int num : nums) {
                if (num * 2 > max && num != max)
                    return -1;
            }
            return indexOfMax;
        }
    }

}