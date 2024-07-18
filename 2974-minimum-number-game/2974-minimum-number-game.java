class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        if (n < 2) return nums;
        
        int[] result = new int[n];
      Arrays.sort(nums);
   //   int index =0;
      for(int i=0 ;i<n; i+=2){
        result[i] = nums[i+1];
        result[i+1] = nums[i];
      }
      
        return result;
    }
}
