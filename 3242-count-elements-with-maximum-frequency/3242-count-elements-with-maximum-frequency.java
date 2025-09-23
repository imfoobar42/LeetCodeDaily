class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
          map.put(n, map.getOrDefault(n, 0)+1);
        }
        int val = 0;
        for(int n:map.values()){
          val =Math.max(n, val);
        }
        int res =0;
        for(int v: map.values()){
          if(v==val) res+=v;
        }
      return res;
      
    }
}