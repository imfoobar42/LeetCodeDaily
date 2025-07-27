class Solution {
    public int countHillValley(int[] nums) {
        //start and end elements can be ignored
        int count = 0;
        //just ignore same elements 
        int current=1;
        int prev= current-1;
        int next = current+1;
        int n = nums.length;
        while(current<n-1){
          while(next<n && nums[current]==nums[next]){
            next++;
          }
          //keep moving next ptr till we have same element
          if(next>=n) break;
          if(nums[current]> nums[prev] && nums[current]>nums[next]) count++; //hill
          else if(nums[current]<nums[prev] && nums[current]<nums[next]) count++; 
          //valley
          current=next;
          prev= current-1;
          next = current+1;
        }
        return count;
    }
}