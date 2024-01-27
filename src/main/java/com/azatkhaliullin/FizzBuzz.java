package com.azatkhaliullin;

import java.util.ArrayList;
import java.util.List;

/**
 * 412
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        List<String> result = solution.fizzBuzz(n);
        System.out.println(result);
    }

    static class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                result.add(check(i));
            }
            return result;
        }

        public String check(int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(n);
            }
        }
    }

}