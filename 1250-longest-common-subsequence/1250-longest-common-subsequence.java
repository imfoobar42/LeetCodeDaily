class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(); //get length of the strings 
        int m = text2.length();
        if(n==0||m==0) return 0; //either or both are null 
        int[][] opt = new int[n+1][m+1]; //dp table 
        for(int i=1;i<n+1;i++){
          for(int j=1;j<m+1;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1)) opt[i][j]= 1+ opt[i-1][j-1]; //when we have a match 
            else
              opt[i][j]= Math.max(opt[i-1][j],opt[i][j-1]); 
              //2 options reduce n or m 
          }
        }        
        return opt[n][m];
    }
}