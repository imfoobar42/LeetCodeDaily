class Solution {
    private String nextString(String og){
      StringBuilder next = new StringBuilder(og.length());
      for(int i=0;i<og.length();i++){
        char c = og.charAt(i);
        char d = (char)('a'+ (c- 'a'+1)%26);
        next.append(d);
      }
      return next.toString();
    }
    public char kthCharacter(int k) {
      //return op after at least k characters 
      //ab
      //bc abbc
      //abbcbccd
      //abbcbccdbccdcdde
      StringBuilder st = new StringBuilder();
      st.append('a');
      while(st.length()<k){
        st.append(nextString(st.toString()));
      }
      return st.charAt(k-1);
    }
}