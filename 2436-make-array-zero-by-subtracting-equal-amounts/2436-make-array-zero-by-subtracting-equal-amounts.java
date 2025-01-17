class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==0) return 1;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
          if(num>0) //count all unique non-zero elements
            set.add(num); 
        }
        return set.size();
}
}