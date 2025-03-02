class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        if(n==2 && nums[0]==0) return new int[]{nums[1],nums[0]};
        for(int i=0;i<n-1;i++){
          if(nums[i]!=0 && nums[i]==nums[i+1]){
              nums[i] = nums[i]*2;
              nums[i+1]= 0;
            }
          }
        int lastZero = 0; //keeps track at the last Zero
        for(int j=0;j<n;j++){
          if(nums[j]!=0){
            nums[lastZero++] = nums[j];
          }
        }
        while(lastZero<n) nums[lastZero++] = 0;
        return nums;
        }
}