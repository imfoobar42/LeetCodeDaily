class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n1 = target.length;
        int n2 = arr.length;
        if(n1!=n2) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: target){
          map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n : arr){
          if(!map.containsKey(n) || map.get(n)==0) return false;
          map.put(n,map.get(n)-1);
        }
      return true;
    }
}