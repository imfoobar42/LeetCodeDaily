class Solution {
    public boolean doesAliceWin(String s) {
      for(char ch : s.toCharArray()){
        if("aeiou".indexOf(ch)>=0){
          //if vowel exists Alice wins
          return true;
        }
      }
      return false;
    }
}