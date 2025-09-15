class Solution {
    private int LCS(String word1, String word2){
      int n= word1.length();
      int m = word2.length();
      int[][] dp = new int[n+1][m+1]; //dp table for lcs 
      
      for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
          if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]= 1+dp[i-1][j-1]; //when they have same char
          else dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]); //get max from prev squares
        }
      }
      return dp[n][m];
    }
    public int minDistance(String word1, String word2) {
        int lcs = LCS(word1, word2);
        return word1.length()+word2.length()-2*lcs;
    }
}