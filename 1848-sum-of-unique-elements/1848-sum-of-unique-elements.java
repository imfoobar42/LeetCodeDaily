class Solution {
    public int sumOfUnique(int[] nums) {
      int sum = 0;
      Map<Integer, Integer> map = new HashMap<>();
      for(int n:nums){
        if(map.getOrDefault(n, 0)==0){
          sum += n;
          map.put(n, 1);
        }
        else{ //when it already exists
          map.put(n, map.get(n)+1);
          if(map.get(n)==2){
            sum -=n;
          }
        }
      }
      return sum;
    }
}