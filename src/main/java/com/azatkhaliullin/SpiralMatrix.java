package com.azatkhaliullin;

import java.util.ArrayList;
import java.util.List;

/**
 * 54
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{{39}, {2}};
        System.out.println(solution.spiralOrder(matrix));
    }

    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean[][] wasHere = new boolean[m][n];
            List<Integer> result = new ArrayList<>(m * n);
            if (m == 1) {
                for (int j = 0; j < n; j++) {
                    result.add(matrix[0][j]);
                }
                return result;
            }
            if (n == 1) {
                for (int[] ints : matrix) {
                    result.add(ints[0]);
                }
                return result;
            }
            int i = 0, j = 0;
            char dir = 'E';

            while (true) {
                result.add(matrix[i][j]);
                wasHere[i][j] = true;

                if (dir == 'E') {
                    if (j < n - 1 && !wasHere[i][j + 1]) {
                        j++;
                    } else if (!wasHere[i + 1][j]) {
                        i++;
                        dir = 'S';
                    } else {
                        break;
                    }
                } else if (dir == 'S') {
                    if (i < m - 1 && !wasHere[i + 1][j]) {
                        i++;
                    } else if (!wasHere[i][j - 1]) {
                        j--;
                        dir = 'W';
                    } else {
                        break;
                    }
                } else if (dir == 'W') {
                    if (j != 0 && !wasHere[i][j - 1]) {
                        j--;
                    } else if (!wasHere[i - 1][j]) {
                        i--;
                        dir = 'N';
                    } else {
                        break;
                    }
                } else {
                    if (!wasHere[i - 1][j]) {
                        i = i - 1;
                    } else if (!wasHere[i][j + 1]) {
                        j++;
                        dir = 'E';
                    } else {
                        break;
                    }
                }
            }
            return result;
        }
    }

}