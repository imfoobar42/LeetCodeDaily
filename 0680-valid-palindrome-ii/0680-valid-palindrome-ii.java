class Solution {
    public boolean validPalindrome(String s) {
        //isPalindrome
        if(checkPalindrome(s, 0, s.length()-1)) return true;   
        int i=0,j =s.length()-1;
        while(i<j){
          if(s.charAt(i)!=s.charAt(j)) return checkPalindrome(s, i+1, j)||checkPalindrome(s, i, j-1);  
        i++;
        j--;
        }
        return true;
    }
    boolean checkPalindrome(String s, int i, int j){
      while(i<j){
        if(s.charAt(i++)!=s.charAt(j--)) return false;
      }
      return true;
    }
}