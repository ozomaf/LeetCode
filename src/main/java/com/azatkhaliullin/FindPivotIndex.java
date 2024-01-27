package com.azatkhaliullin;

/**
 * 724
 */
public class FindPivotIndex {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(solution.pivotIndex(nums));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            int left = 0;
            int right = 0;
            for (int num : nums) {
                right += num;
            }
            for (int i = 0; i < nums.length; i++) {
                right -= nums[i];
                if (left == right) {
                    return i;
                }
                left += nums[i];
            }
            return -1;
        }
    }

}