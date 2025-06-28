class Solution {
    public boolean canPartition(int[] nums) {
       //Variation of 0-1 knapsack
        int sum = 0; 
        for(int n:nums){
          sum += n;
        }
        //if the sum is odd Unequal partitions will be present 
        if(sum%2!=0) return false; 
      int i=0,j=0;
      int n = nums.length;
      int value = sum/2;
      //Initialize a dp table 
      boolean opt[][] = new boolean[n+1][value+1];

      for(i=0;i<n+1;i++){
        opt[i][0]= true;
      }
      for(i=1;i<n+1;i++){
        for(j=1;j<value+1;j++){
          if(nums[i-1]<=j) 
          opt[i][j] = opt[i-1][j-nums[i-1]] || opt[i-1][j]; //Choice over the element
          else opt[i][j] = opt[i-1][j]; //Element processed
        }
      }
    return opt[n][value];
    }
}