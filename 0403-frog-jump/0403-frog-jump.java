class Solution {
    public boolean canCross(int[] stones) {
        //Map to store the last jumps to that stone
        Map<Integer,Set<Integer>> dp = new HashMap<>();
        for(int stone:stones)
          dp.put(stone, new HashSet<>());
        
        dp.get(0).add(0); //given that u get to 0 from 0
        for(int stone:stones){
          for(int jump:dp.get(stone)){
            for(int jumpDistance : new int[]{jump-1, jump, jump+1}){
              if (jumpDistance > 0 && dp.containsKey(stone+jumpDistance)){
                dp.get(stone+jumpDistance).add(jumpDistance);
              }
            }
          }
        }
        return !dp.get(stones[stones.length-1]).isEmpty();
}}