class Solution {
    public boolean canJump(int[] nums) {
      int n = nums.length;
      if(n==1) return true;
      int maxIndex=0; //maintain the maximum index you can reach
      int i=0;
      while(i<n){
        if(i>maxIndex) return false; //cant reach there
        maxIndex = Math.max(maxIndex,i+nums[i]);
        if(maxIndex>n-1) return true;
        i++;
      }
      return true;
    }
}