class Solution {
  public int[] findErrorNums(int[] nums) {
    //brute force 
    //sort then iterate
    Arrays.sort(nums);
    int n=nums.length;
    int sum = nums[0];
    int res[] = new int[2];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1])
        res[0] = nums[i]; //identify the repeated element
      sum+=nums[i];
    }
    res[1]= n*(n+1)/2 - (sum-res[0]);
    return res;
  }
}