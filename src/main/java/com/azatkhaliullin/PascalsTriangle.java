package com.azatkhaliullin;

import java.util.ArrayList;
import java.util.List;

/**
 * 118
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println(solution.generate(n));
    }

    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>(numRows);
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>(numRows);
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        row.add(1);
                    } else {
                        row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                    }
                }
                result.add(row);
            }
            return result;
        }

    }
}