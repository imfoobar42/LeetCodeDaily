class Solution {
    private void swap(int index1, int index2, char[] s){
      char temp = s[index2];
      s[index2] = s[index1];
      s[index1]= temp;
    }
    private void helper(int startIndex, int lastIndex, char[] s){
      //base condition 
      if(startIndex>=lastIndex) return;
      swap(startIndex, lastIndex,s); //swap the elements 
      //reduce the problem
      helper(startIndex+1, lastIndex-1, s);
    }
    public void reverseString(char[] s) {
      helper(0, s.length-1, s);  
    }
}