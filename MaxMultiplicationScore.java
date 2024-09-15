public class MaxMultiplicationScore {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public long maxScore(int[] a, int[] b) {
      int n = b.length;
        
        // Initialize dp variables for the four terms
        long dp0 = Integer.MIN_VALUE;
        long dp1 = Integer.MIN_VALUE;
        long dp2 = Integer.MIN_VALUE;
        long dp3 = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            // Update the dp values in reverse order (to avoid overwriting)
            if (i >= 3) {
                dp3 = Math.max(dp3, dp2 + a[3] * b[i]);
            }
            if (i >= 2) {
                dp2 = Math.max(dp2, dp1 + a[2] * b[i]);
            }
            if (i >= 1) {
                dp1 = Math.max(dp1, dp0 + a[1] * b[i]);
            }
            dp0 = Math.max(dp0, a[0] * b[i]);
        }
        
        return dp3; // This will contain the maximum score
    }
}
