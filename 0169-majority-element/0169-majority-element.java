class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       if(n==1) return nums[0];
       //more than n/2 times
       //Booyer - Moore Voting Algorithm 
       int current = nums[0];
       int count = 0;
       for(int num:nums){
        if(num==current) count++;
        else count--;
        if(count==0){
          current = num;
          count = 1;
        }

       }
    return current;
    }
}