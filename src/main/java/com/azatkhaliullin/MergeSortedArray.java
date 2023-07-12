package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 88
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] result = solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m, j = n - 1; i < nums1.length; i++, j--) {
                nums1[i] = nums2[j];
            }
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0, tmp; j < nums1.length; j++) {
                    if (nums1[i] < nums1[j]) {
                        tmp = nums1[i];
                        nums1[i] = nums1[j];
                        nums1[j] = tmp;
                    }
                }
            }
            return nums1;
        }
    }

}