import java.util.Arrays;

/**
 * 977
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) Math.pow(nums[i], 2);
            }
            return Arrays.stream(nums).sorted().toArray();
        }
    }

}