class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
      if(m==0) return word2;
      if(n==0) return word1;
      int i = 0, j = 0;
      while(i<m && j<n){
          st.append(word1.charAt(i));
          i++;
          st.append(word2.charAt(j));
          j++;
      }
      while(i<m){
          st.append(word1.charAt(i));
        i++;
      }
      while(j<n){
        st.append(word2.charAt(j));
        j++;
      }
      return st.toString();
    
      
    }
}