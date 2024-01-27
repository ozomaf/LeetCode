package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 977
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }

}