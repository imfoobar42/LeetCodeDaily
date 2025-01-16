class Solution {
    public int findMin(int[] nums) {
      //clock wise rotated or right rotation
      int n = nums.length;
      if(n==1 || nums[0]<nums[n-1]) return nums[0];
  
      int low=0;
      int high= n-1;
      while(low<=high){
        int mid = low + (high-low)/2;
        int prev = (mid+n-1)% n; //to preserve out of bounds when mid =0
        int next = (mid +1) % n; //to preserve out of bounds when mid = n-1
        //no equal sign since all numbers are unique
        if(nums[mid]<nums[prev] && nums[mid]<nums[next]) 
          return nums[mid]; //number is less than left and right both
        //# are always sorted on min's left and right part 
        if(nums[mid]<nums[high]) high = mid-1; //right part is sorted, discard right side
        else low = mid+1; //search for min on right side 
      }
      return -1; //will never reach here

    }
}