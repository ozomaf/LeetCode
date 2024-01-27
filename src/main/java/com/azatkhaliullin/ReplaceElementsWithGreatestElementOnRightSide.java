package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 1299
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = solution.replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] replaceElements(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    arr[i] = -1;
                    return arr;
                }
                for (int j = arr.length - 1; j > i; j--) {
                    if (max < arr[j]) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
                max = 0;
            }
            return arr;
        }
    }

}