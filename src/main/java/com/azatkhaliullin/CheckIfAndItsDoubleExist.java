package com.azatkhaliullin;

/**
 * 1346
 */
public class CheckIfAndItsDoubleExist {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 0};
        System.out.println(solution.checkIfExist(arr));
    }

    static class Solution {
        public boolean checkIfExist(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

}