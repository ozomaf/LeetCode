package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 1089
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] result = solution.duplicateZeros(arr);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] duplicateZeros(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    for (int j = arr.length - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    i++;
                }
            }
            return arr;
        }
    }

}