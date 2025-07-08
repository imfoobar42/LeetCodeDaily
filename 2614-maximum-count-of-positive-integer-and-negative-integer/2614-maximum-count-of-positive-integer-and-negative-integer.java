class Solution {
    public int maximumCount(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for(int n:nums){
          if(n>0) count1++;
          else if(n<0) count2++;
        }
        return Math.max(count1,count2);
    }
}