class Solution {
  public int numTrees(int n) {
    int[] dp = new int[n + 1];
    //the moment you choose i and fix root 
    //all 1 to i-1 go on left subtree 
    //all i+1 to n go on right subtree
    //Overlapping subproblem 
    dp[0] = 1; //base case 

    //treat each number as root 
    //then-> left part * right part 
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i] += dp[j - 1] * dp[i - j];
      }
    }
    return dp[n];
  }
}