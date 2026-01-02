class Solution {
  public int repeatedNTimes(int[] nums) {
    int n = nums.length;
    for (int i = 0; i < n - 2; i++) {
      //for a 2N array a element repeated n times 
      //will have repitions close to it 
      if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])
        return nums[i];
    }
    return nums[n - 1];
  }
}