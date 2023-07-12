package com.azatkhaliullin;

/**
 * 1342
 */
public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 123;
        int result = solution.numberOfSteps(num);
        System.out.println(result);
    }

    static class Solution {
        public int numberOfSteps(int num) {
            int cntOfSteps = 0;
            while (num != 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                }
                cntOfSteps++;
            }
            return cntOfSteps;
        }
    }

}