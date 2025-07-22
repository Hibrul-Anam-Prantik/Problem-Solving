package LeetCode;

import java.util.Arrays;

public class MergeSortedArray
{
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
        int[] nums1 = {1,2,3,0,0,0},   nums2 = {2,5,6};
        int m = 3, n = 3;
        sol.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Expected output: [1,2,2,3,5,6]
    }
}

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

