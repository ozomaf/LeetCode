package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 498
 */
public class DiagonalTraverse {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = solution.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int i = 0, j = 0;
            int dir = 1;
            int[] result = new int[m * n];
            int indOfResult = 0;

            while (true) {
                result[indOfResult++] = mat[i][j];

                if (i == m - 1 && j == n - 1) {
                    break;
                }
                if (j == n - 1 && dir > 0) {
                    i += 1;
                    dir = -dir;
                } else if (i == m - 1 && dir < 0) {
                    j += 1;
                    dir = -dir;
                } else if (i == 0 && dir > 0) {
                    j += 1;
                    dir = -dir;
                } else if (j == 0 && dir < 0) {
                    i += 1;
                    dir = -dir;
                } else {
                    i -= dir;
                    j += dir;
                }
            }
            return result;
        }
    }

}