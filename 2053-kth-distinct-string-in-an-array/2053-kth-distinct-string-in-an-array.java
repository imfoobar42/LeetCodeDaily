class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String s: arr){
          map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String t:arr){
          if(map.get(t)==1) count++;
          if(count==k) return t;
        }
      return "";
    }
}