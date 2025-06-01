class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int mid = 0;
      int start = 0;
      int size = letters.length;
      int end = size-1;
      while(start<=end){
        mid = start + (end - start)/2;
        if(target < letters[mid]) end =mid-1;
        else start = mid + 1;

      }
      return letters[start%size];
    }
}