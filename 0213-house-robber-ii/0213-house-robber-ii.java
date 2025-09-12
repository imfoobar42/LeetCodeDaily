class Solution {
    private int houseRob(int[] nums, int start, int end){
      int len = end- start+1;
      if(len==1) return nums[start];
      int[] dp= new int[len];
      dp[0]=nums[start];
      dp[1]=Math.max(nums[start],nums[start+1]);
      for(int i=2;i<len;i++){
        dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start+i]);
      }
      return dp[len-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]; 
        //the problem basically is 
        //either we choose 0th num nums[0]
        //or we choose n-1th num nums[n-1]
        //So now we need to run houseRob for 2 scenarios and compare 
        //from 1. 0 to n-2  and  2. 1 to n-1 and then compare 
        return Math.max(houseRob(nums,0,n-2),houseRob(nums,1,n-1));
    }
}