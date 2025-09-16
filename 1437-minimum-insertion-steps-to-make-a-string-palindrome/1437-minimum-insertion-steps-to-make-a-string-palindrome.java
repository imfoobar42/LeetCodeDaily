class Solution {
    private int lcs(String s, String t){
      int n = s.length();
      int m = t.length();
      int dp[][] = new int[n+1][m+1];
      char[] ch1 = s.toCharArray();
      char[] ch2 = t.toCharArray();
      for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
          if(ch1[i-1]==ch2[j-1]) dp[i][j]= 1+dp[i-1][j-1];
          else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
      return dp[n][m];
    }
    public int minInsertions(String s) {
    if(s.length()==1) return 0;
    String t = new StringBuilder(s).reverse().toString();
    return s.length()-lcs(s,t);
    }
}