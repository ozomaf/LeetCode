package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 283
 */
public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            for (int i = 0, j = 0, tmp; i < nums.length; i++) {
                if (nums[i] != 0) {
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    j++;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

}