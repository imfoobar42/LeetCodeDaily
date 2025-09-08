class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[13][10001];
        int n = coins.length;
        //base condition
        for(int j=1;j<amount+1;j++) dp[0][j]= 10001; //infinite coins 
        for(int i=0;i<n+1;i++) dp[i][0]=0; //when amount is 0 

        for(int i=1;i<n+1;i++){
          for(int j=1;j<amount+1;j++){
             //coins value is less than amount 
            if(coins[i-1]<=j){
            //include or exclude 
            dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
            }
            else dp[i][j]= dp[i-1][j]; //dont include at all  
          }
        }
        return dp[n][amount]>10000? -1: dp[n][amount];
    }
}