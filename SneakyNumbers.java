public class SneakyNumbers {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
    }
}

class Solution1 {
    public int[] getSneakyNumbers(int[] nums) {
        int[] sneakyNum = new int[2];
        int count = 0;
        
        // Iterate through all pairs of numbers
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                // If we find a duplicate
                if(nums[i] == nums[j]) {
                    // Store the repeated number in sneakyNum[count]
                    sneakyNum[count] = nums[i];
                    count++; 
                    // If we've found both sneaky numbers, return the result
                    if (count == 2) {
                        return sneakyNum;
                    }
                } 
            }    
        }
        return sneakyNum; // return result once both numbers are found
    }
}
