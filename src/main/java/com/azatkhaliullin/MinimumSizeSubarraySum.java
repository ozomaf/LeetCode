package com.azatkhaliullin;

/**
 * 209
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int target = 4;
        int[] nums = {1, 4, 4};
        System.out.println(solution.minSubArrayLen(target, nums));
    }

    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLength = Integer.MAX_VALUE;
            int windowSum = 0;
            int left = 0;

            for (int i = 0; i < nums.length; i++) {
                windowSum += nums[i];

                while (windowSum >= target) {
                    minLength = Math.min(minLength, i - left + 1);
                    windowSum -= nums[left];
                    left++;
                }
            }

            return (minLength != Integer.MAX_VALUE) ? minLength : 0;
        }
    }

}