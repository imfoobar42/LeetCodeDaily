class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int firstOccurence = binarySearch(nums, target, true);
        int lastOccurence = binarySearch(nums, target, false);
        return new int[]{firstOccurence, lastOccurence};
    }
    static int binarySearch(int[] arr, int target, boolean first){
      int start = 0;
      int end = arr.length-1;
      int res = -1;
      while(start<=end){
        int mid = start + (end - start)/2;
        if(arr[mid]==target){ 
          res = mid;
          if(first) end = mid-1;
          else start=mid+1;
        }
        else if(arr[mid]<target) start=mid+1;
        else end=mid-1;
      }
      return res;
    }
}