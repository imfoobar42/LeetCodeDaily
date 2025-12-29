class Solution {
  public int maximizeSum(int[] nums, int k) {
    int max = 0;
    for (int num : nums){
      if (num > max) 
        max = num;
      
    }
    int res = max;
    while(--k>0){
      res+= ++max;
    }
    return res;
  }
}