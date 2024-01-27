package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 905
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 4};
        int[] result = solution.sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            for (int i = 0, j = 0, tmp; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    j++;
                }
            }
            return nums;
        }
    }

}