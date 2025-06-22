class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start< end){
          int mid = start + (end - start)/2;
          //we are on decreaseing side and max element will lie on the left
          //we need to search on the left
          //our current element can also be the ans 
          if(nums[mid]> nums[mid+1]) end = mid; 
          else start = mid + 1; // max lies on the right 
        }
        return start; //can return start or end as they are equal
    }
}