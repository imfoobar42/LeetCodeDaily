class Solution {
    public boolean canConstruct(String s, int k) {
        int n = s.length();
        if(k>n) return false; //cant construct when #of palindromes exceed the length of the string
        if(k==n) return true; //every character is a palindrome in itself

        //Solving with bit manipulation 
        int bitMask = 0; //a bit mask of 32 bit
        for(int i=0;i<n;i++)
          bitMask ^= (1<<(s.charAt(i)-'a'));
      return Integer.bitCount(bitMask)<=k;
    }
}