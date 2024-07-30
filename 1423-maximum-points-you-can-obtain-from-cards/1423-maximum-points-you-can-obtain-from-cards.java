class Solution {
  public int maxScore(int[] cardPoints, int k) {
    int n = cardPoints.length;
    int lSum = 0, rSum = 0, maxSum = 0;
    
    for(int i=0;i<k;i++){
      lSum += cardPoints[i];
    }
    maxSum = lSum;
    if(k==n) return maxSum;
    int rIndex = n-1;
    for(int j=k-1;j>=0;j--){
      lSum -= cardPoints[j];
      rSum += cardPoints[rIndex--];
      maxSum = Math.max(maxSum,lSum+rSum);
    }
    return maxSum;
  }
}