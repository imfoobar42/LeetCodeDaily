class Solution {
    public boolean canConstruct(String s, int k) {
      //get length of string 
      int n = s.length();
      if(k>n) return false;
      if(k==n) return true;
      //Possible to construct k palindromes only if the odd count characters < k 
      //maintain the odd count array 
      int[] countArray = new int[26];
      int oddCount = 0;
      //Maintain the frequency of characters in O(n)
      for(int i=0;i<n;i++){
        countArray[s.charAt(i)-'a']++;
      }
      //check the occurencies of odd characters
      for(int j=0;j<26;j++){
        if(countArray[j]%2!=0) 
          ++oddCount;
      }
      return oddCount<=k;
    }
}