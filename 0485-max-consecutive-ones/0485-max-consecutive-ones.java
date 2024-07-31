class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //reset sum when u encounter 0
    int left =0, right =0, n = nums.length, max = 0;
    while(right<n){
      if(nums[right]!=0){ //check if the value at the right index is 1 if yes then update max
        max = Math.max(right-left+1, max);
        ++right;
      }
      else left = ++right;
    }
    return max;
    }
    }