package com.azatkhaliullin;

import java.util.Arrays;

/**
 * 383
 */
public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomNote = "aab";
        String magazine = "baa";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            String[] ransomNoteList = ransomNote.split("");
            String[] magazineList = magazine.split("");
            String[] result = new String[ransomNoteList.length];
            int x = 0;
            for (String i : ransomNoteList) {
                for (int j = 0; j < magazineList.length; j++) {
                    if (i.equals(magazineList[j])) {
                        result[x] = i;
                        magazineList[j] = magazineList[j].replace(magazineList[j], "");
                        x++;
                        break;
                    }
                }
            }
            return Arrays.equals(result, ransomNoteList);
        }
    }

}