class Solution {
    public int climbStairs(int n) {
        //int result = 0;
        if(n==0||n==1) return 1; //Base Condition - 1 way to reach 0 or 1
        int[] dp= new int[n+1];  //dp Array 
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
          dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];
      
    }
}