class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int l=0, r=0, max = 0;
      int n =nums.length;
      while(r<n){
        if(nums[r]!=0){
          max = Math.max(r-l+1,max);
        }
        else l = r+1; //move past the current rIndex
        r++;
      }
      return max;
    }
}