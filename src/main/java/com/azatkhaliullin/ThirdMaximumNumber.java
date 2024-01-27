package com.azatkhaliullin;

/**
 * 414
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        System.out.println(solution.thirdMax(nums));
    }

    static class Solution {
        public int thirdMax(int[] nums) {
            int tmp;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
            int j = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != nums[j - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            if (j < 3) {
                return nums[0];
            }
            return nums[2];
        }
    }

}