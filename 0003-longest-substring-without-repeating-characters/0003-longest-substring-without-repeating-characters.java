class Solution {
  public  int lengthOfLongestSubstring(String s) {
    int n = s.length();
    if (n == 0) return 0; // Handle empty string case   
    int[] hash = new int[256];
    Arrays.fill(hash,-1);
    int l=0, r=0, max = 0;
    while(r<n){
      if(hash[s.charAt(r)]!=-1){ //value already present in hash array
        if(hash[s.charAt(r)]>=l)//check the range of l and index of value 
          l = hash[s.charAt(r)] + 1;
      }
        max = Math.max(r-l+1,max);
        hash[s.charAt(r)] = r; //updating the value to the latest index
        r++;
    }
      return max;
    
    }
}