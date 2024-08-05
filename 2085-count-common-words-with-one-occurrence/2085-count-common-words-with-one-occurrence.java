class Solution {
    public int countWords(String[] words1, String[] words2) {
       // Set<String> set = new HashSet<>();
        Map<String,Integer> map1 = new HashMap<>();
        int count = 0;
        for(String s: words1){
           map1.put(s,map1.getOrDefault(s,0)+1);
        }
        Map<String,Integer> map2 = new HashMap<>();
        for(String s: words2){
          map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(String t:words2){
          if(map1.get(t)!=null && map2.get(t)!=null)
            if(map1.get(t)==1 && map2.get(t)==1) count++;
        }
        return count;
    }
}