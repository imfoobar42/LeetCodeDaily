class Solution {
  public int maxDotProduct(int[] nums1, int[] nums2) {
    int m = nums1.length;
    int n = nums2.length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i < m + 1; i++)
      for (int j = 0; j < n + 1; j++) {
        dp[i][j] = Integer.MIN_VALUE;
      }

    //to choose or not to choose between the current elements 
    //choice at (i,j)
    //skip nums1[i-1]
    //skip nums2[j-1]
    //prod + take the prev subsequence or not
    for (int i = 1; i < m + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        int product = nums1[i - 1] * nums2[j - 1];
        dp[i][j] = Math.max(
            Math.max(dp[i - 1][j], dp[i][j - 1]),
            product + Math.max(0, dp[i - 1][j - 1]));
      }
    }

    return dp[m][n];
  }
}