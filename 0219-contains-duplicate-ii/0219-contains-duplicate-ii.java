class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(n==1) return false;
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
          if(hashMap.containsKey(nums[i]))
            {
              if(Math.abs(hashMap.get(nums[i])-i)<=k)
                return true;
            }
          hashMap.put(nums[i],i);
        }
        return false;
    }
}