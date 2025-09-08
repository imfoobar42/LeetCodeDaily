class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int j=0;j<amount+1;++j)dp[j]=amount+1;
        dp[0]=0; //base case 

        for(int i:coins){
            for(int j=i;j<amount+1;++j){
                dp[j]=Math.min(dp[j-i]+1,dp[j]);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}