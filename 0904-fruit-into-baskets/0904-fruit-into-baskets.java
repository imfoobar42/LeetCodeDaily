class Solution {
  public int totalFruit(int[] fruits) {
      int r = 0, l =0, maxLen = 0;
      int n = fruits.length;  
       Map<Integer,Integer> map = new HashMap<>(); //frequency counter 
       while(r<n){
         map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
         if(map.size()>2){ //if exceeds size 
          if(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);
            if(map.get(fruits[l])==0) //remove fruit at l if count goes to zero
             map.remove(fruits[l]);        
            l++;         
       }
       }
      if(map.size()<=2)
            maxLen = Math.max(maxLen, r-l+1);
      r++;  
      }
      return maxLen;        
  } 
}