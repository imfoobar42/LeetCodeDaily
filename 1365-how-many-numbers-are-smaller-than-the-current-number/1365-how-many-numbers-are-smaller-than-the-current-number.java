class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //brute force 
        int count = 0;
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
          count = 0; //reset counter
          for(int j=0;j<n;j++){
            if(i!=j && nums[j]<nums[i])count++;
          }
          res[i]=count;
        }
        return res;
    }
    //TC: O(n^2)
    //SC: O(n)
}