class Solution {
  public int removeDuplicates(int[] nums) {
    int n = nums.length;
    if (n <= 2)
      return n;
    //write points to the index where next element goes 
    int write = 2;
    for (int i = 2; i < n; i++) {
      if(nums[i]!=nums[write-2]) nums[write++] = nums[i];
    }
    return write;
  }
}