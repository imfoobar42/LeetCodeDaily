class Solution {
    public int[] searchRange(int[] nums, int target) {
      if(nums.length==0) return new int[]{-1,-1};
      //int first_occurence =-1, last_occurence = -1;
      boolean first = true;
      int first_occurence = binarySearch(nums,target,first);
      int last_occurence = binarySearch(nums,target,!first);
      return new int[]{first_occurence, last_occurence};
    }
    private int binarySearch(int[] nums, int target,boolean first){
      int start = 0;
      int res = -1;
      int end = nums.length - 1;
      while(start<=end){
        int mid = start + (end-start)/2;
        if(nums[mid]==target){
          res = mid; //update res everytime we find it match with target and store the index in res
          if(!first){
             start= mid+1; //finding last occurence
             }
          else end=mid-1; //finding first occurrence
        }
        else if(nums[mid]<target) start = mid+1;
        else end = mid-1;
      }
      return res;
    }
}
