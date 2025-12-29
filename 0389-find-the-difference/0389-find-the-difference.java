class Solution {
    public char findTheDifference(String s, String t) {
        int[] countArray = new int[26]; //freq map for characters
        int sLen = s.length();
        for(int i=0;i<sLen;i++) countArray[s.charAt(i)-'a']++;
        for(int j=0;j<sLen+1;j++){
          if(countArray[t.charAt(j)-'a']==0) return t.charAt(j);
          countArray[t.charAt(j)-'a']--;
        }
        return 'a';
    }
}