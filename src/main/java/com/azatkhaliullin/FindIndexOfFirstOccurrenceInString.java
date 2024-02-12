package com.azatkhaliullin;

/**
 * 28
 */
public class FindIndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "leetcodeleeto";
        String needle = "leeto";
        System.out.println(solution.strStr(haystack, needle));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            int ind = 0;
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(ind)) {
                    ind++;
                } else {
                    i = i - ind;
                    ind = 0;
                }
                if (ind == needle.length()) {
                    return i - ind + 1;
                }
            }
            return -1;
        }
    }

}