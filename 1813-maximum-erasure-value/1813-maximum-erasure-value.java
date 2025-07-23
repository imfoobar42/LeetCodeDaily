class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int l=0;
      int r=0;
      int sum=0;
      int res=0;
      Set<Integer> set = new HashSet<>();
      while (r < nums.length) {
        while(set.contains(nums[r])){
            //move left just next to the unique element 
            set.remove(nums[l]);
            sum = sum - nums[l]; //reset the sum value to 0
            l++;
            }
        // i need to move my left till all elements in set are unique 
        //does not contain    
        //already contains the number then reset 
        set.add(nums[r]);
        sum += nums[r];
        res = Math.max(res,sum);
        r++;

      }
      return res;
    }
}