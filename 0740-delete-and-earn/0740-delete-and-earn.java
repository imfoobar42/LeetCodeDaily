

class Solution {
    public int deleteAndEarn(int[] nums) {
        // Step 1. Find max value to size our array
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        // Step 2. Build points array
        // points[x] = total points from picking number x
        int[] points = new int[maxVal + 1];
        for (int num : nums) {
            points[num] += num;
        }

        // Step 3. DP array
        // dp[i] = maximum points obtainable using numbers up to i
        int[] dp = new int[maxVal + 1];

        // Base cases
        dp[0] = points[0];
        if (maxVal >= 1) {
            dp[1] = Math.max(points[0], points[1]);
        }

        // Step 4. Transition
        // For each i >= 2:
        //   skip i -> dp[i-1]
        //   take i -> points[i] + dp[i-2]
        for (int i = 2; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }

        // Step 5. Answer
        return dp[maxVal];
    }
}
