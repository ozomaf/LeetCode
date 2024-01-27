package com.azatkhaliullin;

/**
 * 941
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 2, 3, 1};
        System.out.println(solution.validMountainArray(arr));
    }

    static class Solution {
        public boolean validMountainArray(int[] arr) {
            if (arr.length < 3) {
                return false;
            }
            int i = 0;
            while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                i++;
            }
            if (i == 0 || i == arr.length - 1) {
                return false;
            }
            while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                i++;
            }
            return i == arr.length - 1;
        }
    }

}