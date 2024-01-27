package com.azatkhaliullin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 448
 */
public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution.findDisappearedNumbers(nums));
    }

    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            Set<Integer> numSet = new HashSet<>();
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                numSet.add(num);
            }
            for (int i = 1; i <= nums.length; i++) {
                if (!numSet.contains(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

}