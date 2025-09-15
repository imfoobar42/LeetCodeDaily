class Solution {
  private int editDistance(String word1, String word2){
      int n= word1.length();
      int m = word2.length();
      int[][] dp = new int[n+1][m+1]; //dp table for lcs 
      
      //base case 
      for(int i=0;i<=n;i++) dp[i][0]=i; //delete everything from word1
      for(int j=0;j<=m;j++) dp[0][j]=j;  //insert everything into word2

      //dp[i][j] minm edits to convert word1 to word2
      for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
          if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]= dp[i-1][j-1]; //when they have same char - no need to convert
          //now choose what takes min steps to convert word1 to word2
          //replace, 
          else dp[i][j]= Math.min(Math.min(
            1+dp[i-1][j], //deletion
            1+dp[i][j-1]), //insertion
            1+dp[i-1][j-1] //replacement
            ); 
        }
      }
      return dp[n][m];
    }

    public int minDistance(String word1, String word2) {
      return editDistance(word1, word2);
    }
}

