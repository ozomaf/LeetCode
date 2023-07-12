package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 1672
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int result = solution.maximumWealth(accounts);
        System.out.println(result);
    }

    static class Solution {
        public int maximumWealth(int[][] accounts) {
            int result = 0;
            for (int[] account : accounts) {
                int sum = Arrays.stream(account).sum();
                if (result < sum) {
                    result = sum;
                }
            }
            return result;
        }
    }

}