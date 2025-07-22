package LeetCode;

import java.util.Arrays;

public class Squares_of_a_SortedArray
{
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        // Input: nums = [-4,-1,0,3,10]
        // Output: [0,1,9,16,100]
        int[] nums = {-4,-1,0,3,10};
        int[] result = sol.sortedSquares(nums);
        System.out.println(Arrays.toString(result)); // Expected output: [0,1,9,16,100]
    }
}
class Solution2 {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; ++i) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
