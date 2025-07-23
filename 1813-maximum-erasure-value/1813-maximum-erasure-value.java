class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int res = 0;
        int[] count = new int[10001]; //to maintain freq of numbers 
        while(right < nums.length){
          int current = nums[right];
          sum += current; //add to the sum
          count[current]++; //increase the count of the current element at r 
          while(count[current]>1){
            //move left pointer to the unique elements 
            sum -= nums[left];
            count[nums[left]]--;
            left++;
          }
          res = Math.max(res, sum);
          right++;
        }
      return res;
    }
}