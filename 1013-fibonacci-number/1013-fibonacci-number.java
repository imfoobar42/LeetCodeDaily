class Solution {
    private int find(int n, int dp[]){
      if(n<2) return n; //base case 
      if(dp[n]!=-1) return dp[n]; //check if value is not calculated
      dp[n]= find(n-1,dp)+find(n-2,dp); 
      return dp[n];
    }
    public int fib(int n) {
      int[] dp = new int[n+1]; //dp to store fib values 
      Arrays.fill(dp, -1); 
      return find(n,dp);
    }
}