class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }
        int[] points = new int[max+1];

        for(int num: nums) {
            points[num] += num;
        }

        int[] dp = new int[max+1];
        dp[0] = points[0];
        dp[1] = points[1];
        for(int i = 2; i < max+1; i++) {
            dp[i] = Math.max(points[i] + dp[i-2], dp[i-1]);
        }
        return dp[max];
    }   
}