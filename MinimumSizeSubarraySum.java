/**
 * 209
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int target = 4;
        int[] nums = {1, 4, 4};
        System.out.println(solution.minSubArrayLen(target, nums));
    }

    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLength = 0;
            int currentSum = 0;
            for (int i = 0; i < nums.length; i++) {
                currentSum += nums[i];
                if (currentSum >= target) {
                    minLength = Math.abs(i - nums.length) + 1;
                    currentSum = 0;
                }
            }
            return minLength;
        }
    }

}