class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        if(len==1) return true;
        //maintain a HashMap of values 
        Map<Integer,Integer> map= new HashMap<>();
        for(int n:arr){
          if(!map.containsKey(n)) map.put(n, 1);
          else map.put(n, map.get(n)+1);
        }
        Set<Integer> set = new HashSet<>();
        
        for(int value:map.values()){
          if(set.contains(value)) return false;
          set.add(value);
        }
      return true;
    }
}