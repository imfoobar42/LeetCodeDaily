class Solution {
  private boolean subsetSum(int[] nums, int sum) {
    int n = nums.length;
    boolean check[][] = new boolean[n + 1][sum + 1];
    //intialization
    for (int i = 0; i <= n; i++) {
      check[i][0] = true; // sum 0 is always achievable
    }
    for (int j = 1; j <= sum; j++) {
      check[0][j] = false; // positive sum can't be formed from 0 elements
    }

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < sum + 1; j++) {
        if (nums[i - 1] <= j)
          check[i][j] = check[i - 1][j - nums[i - 1]] || check[i - 1][j];
        //choose the num or ignore 
        else
          check[i][j] = check[i - 1][j]; //not needed 
      }
    }

    return check[n][sum];
  }

  public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % 2 != 0)
      return false;
    //equal sum partition
    return subsetSum(nums, sum / 2);
  }
}