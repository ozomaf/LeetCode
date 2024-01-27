package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 1051
 */
public class HeightChecker {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] currentOrder = {1, 2, 3, 4, 5};
        System.out.println(solution.heightChecker(currentOrder));
    }

    static class Solution {
        public int heightChecker(int[] currentOrder) {
            int tmp;
            int result = 0;
            int[] orderByHeight = new int[currentOrder.length];

            for (int i = 0; i < currentOrder.length; i++) {
                orderByHeight[i] = currentOrder[i];
            }

            for (int i = 0; i < orderByHeight.length; i++) {
                for (int j = 0; j < orderByHeight.length; j++) {
                    if (orderByHeight[i] < orderByHeight[j]) {
                        tmp = orderByHeight[i];
                        orderByHeight[i] = orderByHeight[j];
                        orderByHeight[j] = tmp;
                    }
                }
            }

            for (int i = 0; i < currentOrder.length; i++) {
                if (orderByHeight[i] != currentOrder[i]) {
                    result++;
                }
            }
            System.out.println(Arrays.toString(currentOrder));
            System.out.println(Arrays.toString(orderByHeight));
            return result;
        }
    }

}