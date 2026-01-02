class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //need to maintain a count of values
        int n= arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
          map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> seen = new HashSet<>();
        for(int value:map.values()){
          if(seen.contains(value)) return false;
          seen.add(value);
        }
        return true;
    }
}