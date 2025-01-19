class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        //if(n==2) return Math.min(nums[0],nums[1]);
        Arrays.sort(nums);
        int result = 0;
        for(int i =0;i<n;i=i+2){
          result += nums[i];
        }
        return result; //12 25 66 = 1+2+6
    }  
  }