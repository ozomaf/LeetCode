package com.azatkhaliullin;

/**
 * 27
 */
public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = solution.removeElement(nums, val);
        System.out.println(result);
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }

}