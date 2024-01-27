package com.azatkhaliullin;

import java.util.HashMap;
import java.util.Map;

/**
 * 1218
 */
public class LongestArithmeticSubsequenceOfGivenDifference {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 4, -3, -2, -4, 1};
        int difference = -5;
        System.out.println(solution.longestSubsequence(arr, difference));
    }

    static class Solution {
        public int longestSubsequence(int[] arr, int difference) {
            Map<Integer, Integer> dp = new HashMap<>();
            int maxLength = 0;

            for (int num : arr) {
                int prevNum = num - difference;
                int length = dp.getOrDefault(prevNum, 0) + 1;
                dp.put(num, length);
                maxLength = Math.max(maxLength, length);
            }

            return maxLength;
        }
    }

}
