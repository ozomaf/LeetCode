package com.azatkhaliullin;

/**
 * 1295
 */
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {555, 901, 482, 1771};
        System.out.println(solution.findNumbers(nums));
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int result = 0;
            for (int num : nums) {
                String[] s = String.valueOf(num).split("");
                if (s.length % 2 == 0) {
                    result++;
                }
            }
            return result;
        }
    }

}