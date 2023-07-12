package com.azatkhaliullin;

/**
 * 485
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }

    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int current = 0;
            for (int num : nums) {
                if (num == 1) {
                    current++;
                    max = Math.max(max, current);
                } else {
                    current = 0;
                }
            }
            return max;
        }
    }

}