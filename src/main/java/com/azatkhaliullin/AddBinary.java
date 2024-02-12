package com.azatkhaliullin;

/**
 * 67
 */
public class AddBinary {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "11";
        String b = "1";
        System.out.println(solution.addBinary(a, b));
    }

    static class Solution {
        public String addBinary(String a, String b) {
            char[] aChars = a.toCharArray();
            char[] bChars = b.toCharArray();
            int indA = aChars.length - 1;
            int indB = bChars.length - 1;
            int rest = 0;
            StringBuilder result = new StringBuilder();

            while (indA >= 0 || indB >= 0) {
                int a1 = (indA >= 0) ? aChars[indA] - '0' : 0;
                int b1 = (indB >= 0) ? bChars[indB] - '0' : 0;
                int sum = a1 + b1 + rest;
                rest = sum / 2;
                result.append(sum % 2);

                if (indA >= 0) {
                    indA--;
                }

                if (indB >= 0) {
                    indB--;
                }
            }
            if (rest != 0) {
                result.append(rest);
            }
            return result.reverse().toString();
        }
    }

}