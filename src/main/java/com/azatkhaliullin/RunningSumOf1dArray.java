package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 1480
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1};
        int[] runningSum = solution.runningSum(nums);
        System.out.println(Arrays.toString(runningSum));
    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] runningSum = new int[nums.length];
            runningSum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                    runningSum[i] =  nums[i] + runningSum[i - 1];
            }
            return runningSum;
        }
    }

}